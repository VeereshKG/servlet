package com.xworkz.app;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/education", loadOnStartup = 1)

public class EducationInfoServlet extends GenericServlet {

    public EducationInfoServlet() {
        System.out.println("Created EducationInfoServlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("");
        System.out.println("Education Details");

        System.out.println("");
        System.out.println("School Info");
        String name = servletRequest.getParameter("studentName");
        String schoolName = servletRequest.getParameter("schoolName");
        String yop = servletRequest.getParameter("yearOfPassout");
        String per = servletRequest.getParameter("percentage");
        System.out.println("Student Name :" + name);
        System.out.println("School Name :" + schoolName);
        System.out.println("YearOfPassout :" + yop);
        System.out.println("Percentage :" + per);

        System.out.println("");
        System.out.println("PUC Info");
        String sname = servletRequest.getParameter("studentName");
        String collegeName = servletRequest.getParameter("pucCollegeName");
        String stream = servletRequest.getParameter("optedStream");
        String year = servletRequest.getParameter("pucYearOfPassout");
        String perc = servletRequest.getParameter("percentageInPuc");
        System.out.println("Student Name :" + sname);
        System.out.println("College Name :" + collegeName);
        System.out.println("Stream :" + stream);
        System.out.println("YearOfPassout :" + year);
        System.out.println("Percentage :" + perc);

        System.out.println("");
        System.out.println("Degree Info");
        String stuName = servletRequest.getParameter("studentName");
        String clgName = servletRequest.getParameter("degreeCollegeName");
        String streams = servletRequest.getParameter("optedCourse");
        String yearofp = servletRequest.getParameter("degreeYearOfPassout");
        String percentage = servletRequest.getParameter("percentageInDegree");
        System.out.println("Student Name :" + stuName);
        System.out.println("College Name :" + clgName);
        System.out.println("Stream :" + streams);
        System.out.println("YearOfPassout :" + yearofp);
        System.out.println("Percentage :" + percentage);

        System.out.println("");
        System.out.println("MasterDegree Info");
        String studentName = servletRequest.getParameter("studentName");
        String collName = servletRequest.getParameter("master's collegeName");
        String streams1 = servletRequest.getParameter("streamOpted");
        String yearOfPassout = servletRequest.getParameter("master'sYearOfPassout");
        String percentage1 = servletRequest.getParameter("percentageInMasters");
        System.out.println("Student Name :" + studentName);
        System.out.println("College Name :" + collName);
        System.out.println("Stream :" + streams1);
        System.out.println("YearOfPassout :" + yearOfPassout);
        System.out.println("Percentage :" + percentage1);

    }
}
