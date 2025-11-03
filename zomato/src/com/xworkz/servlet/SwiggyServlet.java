package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/swiggy",loadOnStartup = 1)

public class SwiggyServlet extends  GenericServlet{


        public SwiggyServlet(){
            System.out.println("Created SwiggyServlet");
        }
        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            System.out.println("service method override");
        }
    }

