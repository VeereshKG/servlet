package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/carrot", loadOnStartup = 1)

public class CarrotServlet extends GenericServlet {
    public CarrotServlet() {
        System.out.println("Carrot Servlet is Created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method override in CarrotServlet");
    }
}
