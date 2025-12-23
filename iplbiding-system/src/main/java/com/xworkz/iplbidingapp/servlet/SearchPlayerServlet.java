package com.xworkz.iplbidingapp.servlet;

import com.xworkz.iplbidingapp.dto.PlayerDTO;
import com.xworkz.iplbidingapp.dto.SearchDTO;
import com.xworkz.iplbidingapp.service.PlayerService;
import com.xworkz.iplbidingapp.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = "/searchPlayer", loadOnStartup = 1)
public class SearchPlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String playerType = req.getParameter("playerType");
        String battingAvgStr = req.getParameter("battingAvg");
        String bowlingAvgStr = req.getParameter("bowlingAvg");
        String stumpsStr = req.getParameter("stumps");

        double battingAvg = 0;
        double bowlingAvg = 0;
        int stumps = 0;

        if (battingAvgStr != null && !battingAvgStr.isEmpty()) {
            battingAvg = Double.parseDouble(battingAvgStr);
        }

        if (bowlingAvgStr != null && !bowlingAvgStr.isEmpty()) {
            bowlingAvg = Double.parseDouble(bowlingAvgStr);
        }

        if (stumpsStr != null && !stumpsStr.isEmpty()) {
            stumps = Integer.parseInt(stumpsStr);
        }


        SearchDTO searchDTO = new SearchDTO(playerType,battingAvg,bowlingAvg,stumps);
        System.out.println(searchDTO);

        List<PlayerDTO> playerList = service.searchForPlayers(searchDTO);

        if (playerList != null && !playerList.isEmpty()) {
            req.setAttribute("playerList", playerList);
            req.getRequestDispatcher("SelectPlayer.jsp").forward(req, resp);
        }else {
            req.setAttribute("errormsg" , "Players not exist");
            req.getRequestDispatcher("SelectPlayer.jsp").forward(req, resp);
        }

    }
}