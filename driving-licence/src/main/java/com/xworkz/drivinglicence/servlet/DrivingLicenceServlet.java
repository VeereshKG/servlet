package com.xworkz.drivinglicence.servlet;

import com.xworkz.drivinglicence.dto.DrivingLicenceDTO;
import com.xworkz.drivinglicence.dto.SearchDTO;
import com.xworkz.drivinglicence.exception.DataInvalidException;
import com.xworkz.drivinglicence.exception.DataNotSavedException;
import com.xworkz.drivinglicence.service.DrivingLicenceService;
import com.xworkz.drivinglicence.service.DrivingLicenceServiceImpl;
import lombok.SneakyThrows;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/licence", loadOnStartup = 1)
public class DrivingLicenceServlet extends HttpServlet {

    DrivingLicenceService service = new DrivingLicenceServiceImpl();

    public DrivingLicenceServlet() {
        System.out.println("DrivingLicenceServlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Getting parameter");

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");
        String aadhar = req.getParameter("aadhar");
        String mobile = req.getParameter("mobile");

        System.out.println("Instance of DrivingLicenceDTO");
        try {
            DrivingLicenceDTO dto =
                    new DrivingLicenceDTO(name, Integer.parseInt(age),
                            address, Long.parseLong(aadhar), Long.parseLong(mobile));

            System.out.println("DrivingLicenceDTO --->" + dto);

            service.validate(dto);

            System.out.println("Setting Attribute...");

            req.setAttribute("name", name);
            req.setAttribute("age", age);
            req.setAttribute("address", address);
            req.setAttribute("aadhar", aadhar);
            req.setAttribute("mobile", mobile);
            req.setAttribute("success", "Driving Licence Registered Successfully");


            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("sessionName", name);

            System.out.println("Forwarding to Result.jsp");
            req.getRequestDispatcher("Result.jsp").forward(req, resp);

        } catch (DataInvalidException e) {
            req.setAttribute("error", "Data not saved");
            req.getRequestDispatcher("DrivingLicenceForm.jsp").forward(req, resp);

        } catch (DataNotSavedException e) {

            req.setAttribute("aadharerror", "Entered Aadhar is Already Registered");
            req.getRequestDispatcher("DrivingLicenceForm.jsp").forward(req, resp);
        }
    }

    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String submit = req.getParameter("submit");
        if ("clear".equalsIgnoreCase(submit)) {
            req.setAttribute("dto", null);
        } else {
            String aadhar = req.getParameter("aadharNo");


            SearchDTO searchDTO = new SearchDTO(Long.parseLong(aadhar));

            Optional<DrivingLicenceDTO> dto = service.search(searchDTO);

            if (dto.isPresent()) {
                req.setAttribute("dto", dto.get());
            } else {
                req.setAttribute("aadharerror",
                        "Aadhar number is not registered. Please click on Register.");
            }


        }
        req.getRequestDispatcher("DrivingLicenceSearch.jsp").forward(req, resp);

    }
}
