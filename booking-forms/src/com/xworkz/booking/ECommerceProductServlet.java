package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product",loadOnStartup = 1)

public class ECommerceProductServlet extends HttpServlet {

    public ECommerceProductServlet(){
        System.out.println("ECommerceProductServlet is created");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String productName = req.getParameter("productName");
        String price = req.getParameter("price");
        String category = req.getParameter("category");
        String description = req.getParameter("description");
        String payment = req.getParameter("payment");


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1 style='color: green;'> Product Details Saved Successfully </h1>");
        writer.println("<h3 style='color: blue;'>Entered Product Details Are:</h3>");
        writer.println("Product Name : " + productName + "<br>");
        writer.println("Price : " + price + "<br>");
        writer.println("Category : " + category + "<br>");
        writer.println("Description : " + description + "<br>");
        writer.println("Payment Mode : " + payment + "<br>");
        writer.println("<a href='E-commerceProduct.html' target='blank' style:'color:red'>Click here To Another Product Booking</a>");

    }
}
