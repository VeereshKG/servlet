package com.xworkz.coffee.servlet;

import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.service.CoffeeLandService;
import com.xworkz.coffee.service.impl.CoffeeLandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffeeland", loadOnStartup = 1)

public class CoffeeLandServlet extends HttpServlet {

    public CoffeeLandServlet() {
        System.out.println("CoffeeLandServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getParameter("size");
        String plant = req.getParameter("plant");
        String yeild = req.getParameter("yeild");
        String exp = req.getParameter("exp");
        String profit = req.getParameter("profit");
        String fertilizer = req.getParameter("fertilizer");
        String check = req.getParameter("check");


        System.out.println("Setting attributes in CoffeeLandServlet to send to jsp");
        req.setAttribute("Size", size);
        req.setAttribute("Plant", plant);
        req.setAttribute("Yeild", yeild);
        req.setAttribute("expenditure", exp);
        req.setAttribute("Profit", profit);
        req.setAttribute("fertilizer", fertilizer);
        req.setAttribute("Check", check);

        CoffeeLandDTO coffeeLandDTO = new CoffeeLandDTO(Integer.parseInt(size), plant, yeild, Double.parseDouble(exp), Double.parseDouble(profit), Integer.parseInt(fertilizer), check);
        System.out.println("CoffeeLandDTO --- >"+coffeeLandDTO);

        CoffeeLandService coffeeLandService = new CoffeeLandServiceImpl();
        coffeeLandService.validateAndSave(coffeeLandDTO);

        System.out.println("Forwarding to jsp");
        req.getRequestDispatcher("CoffeeLandResult.jsp").forward(req, resp);
    }
}
