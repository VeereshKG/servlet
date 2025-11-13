package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie", loadOnStartup = 1)

public class MovieTicketServlet extends HttpServlet {

    public MovieTicketServlet() {
        System.out.println("MovieTicketServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String movieName = req.getParameter("movieName");
        String name = req.getParameter("name");
        String theatre = req.getParameter("theatre");
        String requests = req.getParameter("requests");
        String seatType = req.getParameter("seatType");


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
        writer.println("<title>Movie Booking Confirmation</title>");
        writer.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");

        writer.println("<h1 class='text-success text-center mb-4'>Booking Successful! Enjoy Your Movie 🎬</h1>");
        writer.println("<h3 class='text-primary mb-3'>Booking Details Are:</h3>");

        writer.println("<ul class='list-group mb-4'>");
        writer.println("<li class='list-group-item'><strong>Movie Name:</strong> " + movieName + "</li>");
        writer.println("<li class='list-group-item'><strong>Your Name:</strong> " + name + "</li>");
        writer.println("<li class='list-group-item'><strong>Theatre Name:</strong> " + theatre + "</li>");
        writer.println("<li class='list-group-item'><strong>Special Requests:</strong> " + requests + "</li>");
        writer.println("<li class='list-group-item'><strong>Seat Type:</strong> " + seatType + "</li>");
        writer.println("</ul>");

        writer.println("<div class='text-center'>");
        writer.println("<a href='MovieTicket.html' target='_blank' class='btn btn-danger'>Book Another Movie</a>");
        writer.println("</div>");

        writer.println("</div>");
        writer.println("</div>");

        writer.println("</body>");
        writer.println("</html>");

    }
}
