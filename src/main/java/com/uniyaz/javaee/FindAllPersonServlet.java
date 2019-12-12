package com.uniyaz.javaee;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by AKARTAL on 12.12.2019.
 */
public class FindAllPersonServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Init metodu çalıştı");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("ServletConfig metodu çalıştı");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String ad = servletRequest.getParameter("ad");
        System.out.println(ad + " sisteme giriş yaptı.");
    }

    @Override
    public String getServletInfo() {
        System.out.println("ServletInfo metodu çalıştı");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Service metodu çalıştı");
    }
}
