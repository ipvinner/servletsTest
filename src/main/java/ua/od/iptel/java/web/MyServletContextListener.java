package ua.od.iptel.java.web;

import ua.od.iptel.java.model.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by ipvinner on 23.01.2016.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        String dogBread = servletContext.getInitParameter("bread");
        Dog dog = new Dog(dogBread);
        servletContext.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
