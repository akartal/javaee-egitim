package com.uniyaz.javaee.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by AKARTAL on 12.12.2019.
 */
public class SavePersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println(name);

        String html =
                "<html> \n" +
                        "\t<head> \n" +
                        "\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                        "\t\t<title>Universal Bilişim Teknolojileri</title>\n" +
                        "\t</head>\n" +
                        "\t<body>\n" +
                        "\t\tLütfen Bekleyiniz...\n" + "ĞÜŞİÖÇ" + name +
                        "\t</body>\n" +
                        "</html>\n";
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(html);
    }
}
