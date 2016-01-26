package ua.od.iptel.java.web;

import ua.od.iptel.java.model.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ipvinner on 23.01.2016.
 */
public class ListenerTester extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h3> Test Dog listener </h3> </br>");
        printWriter.println("</br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");

        printWriter.println("Dog bread is : " + dog.getBread());
    }
}
