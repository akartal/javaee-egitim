package com.uniyaz.javaee;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by AKARTAL on 12.12.2019.
 */
public class SavePersonServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        System.out.println(name);

        String html =
                "<html> \n" +
                        "\t<head> \n" +
                        "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                        "\t\t<title>Universal Bilişim Teknolojileri</title>\n" +
                        "\t</head>\n" +
                        "\t<body>\n" +
                        "\t\tLütfen Bekleyiniz...\n" +
                        "\t</body>\n" +
                        "</html>\n";
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.getWriter().write(html);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
