package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
        writer.println("<title>Flight Booking Confirmation</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");

        writer.println("<h1 class='text-success text-center mb-4'>Flight Booked Successfully</h1>");
        writer.println("<h3 class='text-primary mb-3'>Passenger Details Are:</h3>");

        writer.println("<ul class='list-group mb-4'>");
        writer.println("<li class='list-group-item'><strong>Passenger Name:</strong> " + passengerName + "</li>");
        writer.println("<li class='list-group-item'><strong>Source:</strong> " + source + "</li>");
        writer.println("<li class='list-group-item'><strong>Destination:</strong> " + destination + "</li>");
        writer.println("<li class='list-group-item'><strong>Special Instructions:</strong> " + instructions + "</li>");
        writer.println("<li class='list-group-item'><strong>Class Type:</strong> " + classType + "</li>");
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='FlightTicket.html' target='_blank' class='btn btn-danger'>Book Another Flight</a>");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");



    }
}
