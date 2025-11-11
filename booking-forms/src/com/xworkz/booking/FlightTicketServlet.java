package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)

public class FlightTicketServlet extends HttpServlet {

    public FlightTicketServlet(){
        System.out.println("FlightTicketServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String passengerName = req.getParameter("passengerName");
        String source = req.getParameter("source");
        String destination = req.getParameter("destination");
        String instructions = req.getParameter("instructions");
        String classType = req.getParameter("classType");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1 style='color: green;'> Flight Booked Successfully </h1>");
        writer.println("<h3 style='color: blue;'>Passenger Details Are:</h3>");
        writer.println("Passenger Name : " + passengerName + "<br>");
        writer.println("Source : " + source + "<br>");
        writer.println("Destination : " + destination + "<br>");
        writer.println("Special Instructions : " + instructions + "<br>");
        writer.println("Class Type : " + classType + "<br>");

        writer.println("<a href='FilghtTicket.html' target='blank' style:'color:red'>Click here To Another Flight Booking</a>");


    }
}
