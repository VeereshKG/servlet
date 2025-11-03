package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.awt.print.Book;
import java.io.IOException;

@WebServlet(urlPatterns = "/book", loadOnStartup = 1)

public class BookServlet extends GenericServlet {

    public BookServlet() {
        System.out.println("Created BookServlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method override");
    }
}
