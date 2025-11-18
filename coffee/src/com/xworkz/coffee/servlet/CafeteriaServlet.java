package com.xworkz.coffee.servlet;

import com.xworkz.coffee.dto.CafeteriaDTO;
import com.xworkz.coffee.service.CafeteriaService;
import com.xworkz.coffee.service.impl.CafeteriaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria", loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {

    public CafeteriaServlet() {
        System.out.println("CafeteriaServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String location = req.getParameter("location");
        String type = req.getParameter("type");
        String price = req.getParameter("price");
        String franchise = req.getParameter("franchise");
        String owner = req.getParameter("owner");
        String gst = req.getParameter("gst");

        System.out.println("Setting attributes in CafeteriaServlet to send to jsp");

        req.setAttribute("name", name);
        req.setAttribute("location", location);
        req.setAttribute("type", type);
        req.setAttribute("price", price);
        req.setAttribute("franchise", franchise);
        req.setAttribute("owner", owner);
        req.setAttribute("gst", gst);

        CafeteriaDTO cafeteriaDTO = new CafeteriaDTO(name, location, type, Double.parseDouble(price), franchise, owner, gst);
        System.out.println("cafeteriaDTO--->"+cafeteriaDTO);

        CafeteriaService cafeteriaService = new CafeteriaServiceImpl();
        cafeteriaService.validateAndSave(cafeteriaDTO);

        System.out.println("Forwarding to jsp");
        req.getRequestDispatcher("CafeteriaResult.jsp").forward(req, resp);
    }
}
