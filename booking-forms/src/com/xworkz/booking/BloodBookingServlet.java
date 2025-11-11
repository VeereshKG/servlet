package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1 style='color: green;'> Details Saved SuccessFully </h1>");
        writer.println("<h3 style='color: red;'>Entered Details Are</h3>");
        writer.println("Donor Name :" + donorName + "<br>");
        writer.println("Contact Number :" + contactNumber + "<br>");
        writer.println("Age :" + age + "<br>");
        writer.println("BloodGroup :" + bloodGroup + "<br>");
        writer.println("Address :" + address + "<br>");
        writer.println("Availability :" + availability + "<br>");

        writer.println("<a href='BloodBooking.html' target='blank' style:'color:red'>Click here To Another Booking</a>");


    }
}
