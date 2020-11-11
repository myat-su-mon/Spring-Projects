package com.solt.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String hobby = request.getParameter("hobby");

        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Servlet First Servlet </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Hello Servlet </h1>");
            out.println("<h3> Name: " + name + "</h3>");
            out.println("<h3> Hobby: " + hobby + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
