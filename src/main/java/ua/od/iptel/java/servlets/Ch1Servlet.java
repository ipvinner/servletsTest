package ua.od.iptel.java.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by ipvinner on 17.01.2016.
 */
public class Ch1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        Date date = new Date();

        out.print("<html>" +
        "<body>" + "<h1>" + date + "</h1>" +
        "</body>" + "</html>");
    }
}
