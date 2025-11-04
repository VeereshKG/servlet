package com.xworkz.app;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/skill", loadOnStartup = 1)

public class SkillSetServlet extends GenericServlet {

    public SkillSetServlet() {
        System.out.println("Created SkillSetServlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("");
        System.out.println("Skill Set");
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String primarySkill = servletRequest.getParameter("primarySkill");
        String secondarySkill = servletRequest.getParameter("secondarySkill");
        String db = servletRequest.getParameter("dataBase");
        String ide = servletRequest.getParameter("ide");
        String ui = servletRequest.getParameter("ui");
        String exp = servletRequest.getParameter("experience");
        String frameworks = servletRequest.getParameter("frameworks");
        String skill = servletRequest.getParameter("otherSkills");

        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Primary Skill :" + primarySkill);
        System.out.println("Secondary Skill :" + secondarySkill);
        System.out.println("DataBase :" + db);
        System.out.println("IDE's :" + ide);
        System.out.println("UI Technologies :" + ui);
        System.out.println("Experience(In Years) :" + exp);
        System.out.println("FrameWork :" + frameworks);
        System.out.println("Other Skills :" + skill);


    }
}
