package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

        Cookie[]cookies = req.getCookies();
        if (cookies == null || cookies.length<1){
            throw new IllegalArgumentException("Cookie is not Created Go To Index page And Create Cookie......");
        }else {
            for (Cookie cookie : cookies)
                System.out.println("The name of the Cookie Name is:"+cookie.getName()+"Value of the Cookie is:"+cookie.getValue());
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Food Order Confirmation</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");

        writer.println("<h1 class='text-success text-center mb-4'>Order Received Successfully</h1>");
        writer.println("<h3 class='text-primary mb-3'>Order Details Are:</h3>");

        writer.println("<ul class='list-group mb-4'>");
        writer.println("<li class='list-group-item'><strong>Restaurant Name:</strong> " + customerName + "</li>");
        writer.println("<li class='list-group-item'><strong>Ordered Items:</strong> " + items + "</li>");
        writer.println("<li class='list-group-item'><strong>Customer Name:</strong> " + name + "</li>");
        writer.println("<li class='list-group-item'><strong>Phone Number:</strong> " + phoneNumber + "</li>");
        writer.println("<li class='list-group-item'><strong>Address:</strong> " + address + "</li>");
        writer.println("<li class='list-group-item'><strong>Payment Mode:</strong> " + paymentMode + "</li>");
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='FoodOrder.html' target='_blank' class='btn btn-danger'>Click Here to Order Again</a>");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");


    }
}
