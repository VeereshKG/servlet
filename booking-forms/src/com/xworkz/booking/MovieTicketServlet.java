package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)

public class MovieTicketServlet extends HttpServlet {

    public MovieTicketServlet(){
        System.out.println("MovieTicketServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String movieName = req.getParameter("movieName");
        String name = req.getParameter("name");
        String theatre = req.getParameter("theatre");
        String requests = req.getParameter("requests");
        String seatType = req.getParameter("seatType");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1 style='color: green;'>Booking Successfully Enjoy Movie</h1>");
        writer.println("<h3 style='color: blue;'>Booking Details Are:</h3>");
        writer.println("Movie Name : " + movieName + "<br>");
        writer.println("Your Name : " + name + "<br>");
        writer.println("Theatre Name : " + theatre + "<br>");
        writer.println("Special Requests : " + requests + "<br>");
        writer.println("Seat Type : " + seatType + "<br>");

        writer.println("<a href='MovieTickect.html' target='blank' style:'color:red'>Click here To Do Another Booking</a>");
    }
}
