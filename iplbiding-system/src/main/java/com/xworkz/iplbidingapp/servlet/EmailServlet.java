package com.xworkz.iplbidingapp.servlet;

import com.xworkz.iplbidingapp.dto.CompanyDTO;
import com.xworkz.iplbidingapp.exception.DataInvalidException;
import com.xworkz.iplbidingapp.service.PlayerService;
import com.xworkz.iplbidingapp.service.PlayerServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/email", loadOnStartup = 1)
public class EmailServlet extends HttpServlet {

    PlayerService service = new PlayerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");

        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setEmail(email);

        try {
            Optional<CompanyDTO> optionalCompany = service.validateEmail(companyDTO);

            HttpSession session = req.getSession();
            session.setAttribute("company", optionalCompany.get());

            req.getRequestDispatcher("SelectPlayer.jsp").forward(req, resp);
            req.getRequestDispatcher("Bidding.jsp").forward(req, resp);

        } catch (DataInvalidException e) {

            req.setAttribute("error", e.getMessage());

            req.getRequestDispatcher("Email.jsp").forward(req, resp);
        }
    }

}


