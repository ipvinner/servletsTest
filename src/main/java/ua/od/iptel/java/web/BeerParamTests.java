package ua.od.iptel.java.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by ipvinner on 18.01.2016.
 */
public class BeerParamTests extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("TEST init params <br/>");

        Enumeration enumeration = getServletConfig().getInitParameterNames();
        while(enumeration.hasMoreElements()){
            out.println("param + " + enumeration.nextElement() + "<br/>");
        }

//        out.println("admin email: " + getServletConfig().getInitParameter("adminEmail") + "<br/>");
        out.println("admin email: " + getServletContext().getInitParameter("adminEmail") + "<br/>");
        out.println("main email: " + getServletConfig().getInitParameter("mainEmail") + "<br/>");

    }
}
