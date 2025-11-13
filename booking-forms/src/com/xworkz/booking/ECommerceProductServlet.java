package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

        Cookie []cookies = req.getCookies();
        if (cookies == null || cookies.length<1){
            throw new IllegalArgumentException("Cookie is not Created Go To Index page And Create Cookie......");
        }else {
            for (Cookie cookie : cookies)
                System.out.println("The name of the Cookie Name is:"+cookie.getName()+"Value of the Cookie is:"+cookie.getValue());
        }

//
//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//
//        writer.println("<h1 style='color: green;'> Product Details Saved Successfully </h1>");
//        writer.println("<h3 style='color: blue;'>Entered Product Details Are:</h3>");
//        writer.println("Product Name : " + productName + "<br>");
//        writer.println("Price : " + price + "<br>");
//        writer.println("Category : " + category + "<br>");
//        writer.println("Description : " + description + "<br>");
//        writer.println("Payment Mode : " + payment + "<br>");
//        writer.println("<a href='E-commerceProduct.html' target='blank' style:'color:red'>Click here To Another Product Booking</a>");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Product Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");

        writer.println("<h1 class='text-success text-center mb-4'>Product Details Saved Successfully</h1>");
        writer.println("<h3 class='text-primary mb-3'>Entered Product Details Are:</h3>");

        writer.println("<ul class='list-group mb-4'>");
        writer.println("<li class='list-group-item'><strong>Product Name:</strong> " + productName + "</li>");
        writer.println("<li class='list-group-item'><strong>Price:</strong> ₹" + price + "</li>");
        writer.println("<li class='list-group-item'><strong>Category:</strong> " + category + "</li>");
        writer.println("<li class='list-group-item'><strong>Description:</strong> " + description + "</li>");
        writer.println("<li class='list-group-item'><strong>Payment Mode:</strong> " + payment + "</li>");
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='E-commerceProduct.html' target='_blank' class='btn btn-danger'>Click Here for Another Product Booking</a>");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");

    }
}
