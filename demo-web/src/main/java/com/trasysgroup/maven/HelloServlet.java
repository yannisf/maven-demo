package com.trasysgroup.maven;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    private static final Logger LOG = Logger.getLogger(HelloServlet.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        LOG.info("About to greet " + name);
        GreetingHelper helper = new GreetingHelper(name);
        response.getWriter().println(helper.createGreeting());
    }

}
