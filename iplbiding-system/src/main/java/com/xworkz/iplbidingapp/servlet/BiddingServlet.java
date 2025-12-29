package com.xworkz.iplbidingapp.servlet;


import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.service.PlayerService;
import com.xworkz.iplbidingapp.service.PlayerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/bid", loadOnStartup = 1)
public class BiddingServlet extends HttpServlet {

    private PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        System.out.println("doget in BiddingServlet");

        String playerName = req.getParameter("PlayerName");

        req.setAttribute("name", playerName);
        req.getRequestDispatcher("Bidding.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("doPost in BiddingServlet");

        String playerName = req.getParameter("playerName");
        String bidAmount = req.getParameter("price");

        double price = Double.parseDouble(bidAmount);

        HttpSession session = req.getSession(false);

        CompanyDTO companyDTO = (CompanyDTO) session.getAttribute("company");

        String companyName = companyDTO.getCompany();

        boolean saved = service.placeBid(playerName, companyName, price);

        if (saved) {
            req.setAttribute("success", "Bid placed successfully!");
        } else {
            req.setAttribute("error", "Bid failed");
        }
        System.out.println("complete");
        req.setAttribute("name", playerName);
        req.getRequestDispatcher("Bidding.jsp").forward(req, resp);
    }
}
