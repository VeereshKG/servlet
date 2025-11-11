package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/food",loadOnStartup = 1)

public class FoodOrderServlet extends HttpServlet {

    public FoodOrderServlet(){
        System.out.println("FoodOrderServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String customerName = req.getParameter("restaurant");
        String items = req.getParameter("items");
        String name = req.getParameter("name");
        String phoneNumber = req.getParameter("phoneNumber");
        String address = req.getParameter("address");
        String paymentMode = req.getParameter("paymentMode");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1 style='color: green;'> Order Received Successfully </h1>");
        writer.println("<h3 style='color: blue;'> Order Details Are:</h3>");
        writer.println("Restaurant Name : " + customerName + "<br>");
        writer.println("Ordered Items : " + items + "<br>");
        writer.println("Customer Name : " + name + "<br>");
        writer.println("Phone Number : " + phoneNumber + "<br>");
        writer.println("Address : " + address + "<br>");
        writer.println("Payment Mode : " + paymentMode + "<br>");

        writer.println("<a href='FoodOrder.html' target='blank' style:'color:red'>Click here To Order Again</a>");
    }
}
