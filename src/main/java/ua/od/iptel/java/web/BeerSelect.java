package ua.od.iptel.java.web;

import ua.od.iptel.java.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ipvinner on 17.01.2016.
 */
public class BeerSelect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        BeerExpert beerExpert = new BeerExpert();
        out.println("Beer Selecttion Advice<br>");
        String s = req.getParameter("color");

        List<String> recommended = beerExpert.getBrands(s);
//
//        out.println("<br>Gott beer color: <strong>" + s + "</strong>");
//        Iterator it = recommended.iterator();
//        while (it.hasNext()){
//            out.println("<br>We recomended <strong>" + it.next() + "</strong>");
//        }

        req.setAttribute("styles", recommended);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req, resp);

    }
}
