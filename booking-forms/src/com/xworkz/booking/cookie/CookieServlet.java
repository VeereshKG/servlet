package com.xworkz.booking.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/cookie",loadOnStartup = 1)

public class CookieServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    Cookie cookie = new Cookie("x-workz","ARFJWgt#bdik#se@57964$%");
    resp.addCookie(cookie);
    resp.sendRedirect("index.html");
  }

}
