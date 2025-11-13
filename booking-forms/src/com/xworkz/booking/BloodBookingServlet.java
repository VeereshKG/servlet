package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood", loadOnStartup = 1)

public class BloodBookingServlet extends HttpServlet {

    public BloodBookingServlet() {
        System.out.println("BloodBookingServlet is Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String donorName = req.getParameter("donorName");
        String contactNumber = req.getParameter("contactNumber");
        String age = req.getParameter("age");
        String bloodGroup = req.getParameter("bloodGroup");
        String address = req.getParameter("address");
        String availability = req.getParameter("availability");

        Cookie cookies[] = req.getCookies();
        if (cookies ==null || cookies.length<1){
            throw new IllegalArgumentException("Cookie is not Created Go To Index page And Create Cookie......");
        }else{
            for (Cookie cookie: cookies) {
                System.out.println("The name of the Cookie Name is:"+cookie.getName()+"Value of the Cookie is:"+cookie.getValue());
            }
        }

//        resp.setContentType("text/html");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1 style='color: green;'> Details Saved SuccessFully </h1>");
//        writer.println("<h3 style='color: red;'>Entered Details Are</h3>");
//        writer.println("Donor Name :" + donorName + "<br>");
//        writer.println("Contact Number :" + contactNumber + "<br>");
//        writer.println("Age :" + age + "<br>");
//        writer.println("BloodGroup :" + bloodGroup + "<br>");
//        writer.println("Address :" + address + "<br>");
//        writer.println("Availability :" + availability + "<br>");
//
//        writer.println("<a href='BloodBooking.html' target='blank' style:'color:red'>Click here To Another Booking</a>");
//


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Donor Details</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow p-4'>");

        writer.println("<h1 class='text-success text-center mb-4'>Details Saved Successfully</h1>");
        writer.println("<h3 class='text-danger mb-3'>Entered Details Are:</h3>");

        writer.println("<ul class='list-group mb-4'>");
        writer.println("<li class='list-group-item'><strong>Donor Name:</strong> " + donorName + "</li>");
        writer.println("<li class='list-group-item'><strong>Contact Number:</strong> " + contactNumber + "</li>");
        writer.println("<li class='list-group-item'><strong>Age:</strong> " + age + "</li>");
        writer.println("<li class='list-group-item'><strong>Blood Group:</strong> " + bloodGroup + "</li>");
        writer.println("<li class='list-group-item'><strong>Address:</strong> " + address + "</li>");
        writer.println("<li class='list-group-item'><strong>Availability:</strong> " + availability + "</li>");
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='BloodBooking.html' target='_blank' class='btn btn-primary'>Click Here for Another Booking</a>");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");

    }
}
