package com.xworkz.iplbidingapp.servlet;

import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.exception.DataInvalidException;
import com.xworkz.iplbidingapp.exception.DataNotSavedException;
import com.xworkz.iplbidingapp.service.PlayerService;
import com.xworkz.iplbidingapp.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/player",loadOnStartup = 1)
public class PlayerServlet extends HttpServlet {

    PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("getting parameter");

       String playerName = req.getParameter("playerName");
        String age = req.getParameter("age");
        String playerType = req.getParameter("playerType");
        String state = req.getParameter("state");
        String battingAvg = req.getParameter("battingAvg");
        String bowlingAvg = req.getParameter("bowlingAvg");
        String stumps = req.getParameter("stumps");

        System.out.println("instance creation of playerDTO");

        PlayerDTO playerDTO = new PlayerDTO(playerName,Integer.parseInt(age),playerType,state,Double.parseDouble(battingAvg),Double.parseDouble(bowlingAvg),Integer.parseInt(stumps));

        try {
            System.out.println(playerDTO);

           service.validateAndSave(playerDTO);

            req.setAttribute("name" , playerName);
            req.setAttribute("age" , age);
            req.setAttribute("type" , playerType);
            req.setAttribute("state" , state);
            req.setAttribute("battingAvg" , battingAvg);
            req.setAttribute("bowlingAvg" , bowlingAvg);
            req.setAttribute("stumps" , stumps);
            req.setAttribute("sucess","player data saved sucessfully");

            System.out.println("Forwarding to Result.jsp");

            req.getRequestDispatcher("Result.jsp").forward(req, resp);


        } catch (DataInvalidException e) {
            req.setAttribute("error", "player Data not saved");

            req.getRequestDispatcher("PlayerRegister.jsp").forward(req, resp);

        } catch (DataNotSavedException e) {
            req.setAttribute("playererror", "Entered Player Name is Already registered");
            System.out.println("Already");
            req.getRequestDispatcher("PlayerRegister.jsp").forward(req, resp);
        }

    }
}
