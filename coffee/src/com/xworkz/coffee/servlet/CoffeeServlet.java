package com.xworkz.coffee.servlet;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.service.CoffeeService;
import com.xworkz.coffee.service.impl.CoffeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/coffeeservlet",loadOnStartup = 1)

public class CoffeeServlet extends HttpServlet {

    public CoffeeServlet(){
        System.out.println("CoffeeServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String type =  req.getParameter("type");
        Double price = Double.parseDouble(req.getParameter("price")) ;
        Double quantity =  Double.parseDouble(req.getParameter("quantity"));
        String farmer =  req.getParameter("farmer");
        String location =  req.getParameter("location");
        String zip =  req.getParameter("zip");

        double totalcost = price * quantity;

        System.out.println("Setting attributes in CoffeeServlet to send to jsp");
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("quantity",quantity);
        req.setAttribute("farmer",farmer);
        req.setAttribute("location",location);
        req.setAttribute("zip",zip);
        req.setAttribute("TotalCost",totalcost);

        CoffeeDTO coffeeDTO = new CoffeeDTO(type,price,quantity,farmer,location,Integer.parseInt(zip));
        System.out.println("CoffeeDTO---> "+coffeeDTO);

        CoffeeService coffeeService = new CoffeeServiceImpl();
        coffeeService.validateAndSave(coffeeDTO);


        System.out.println("Forwarding to jsp");
        req.getRequestDispatcher("CoffeeResult.jsp").forward(req,resp);
    }
}
