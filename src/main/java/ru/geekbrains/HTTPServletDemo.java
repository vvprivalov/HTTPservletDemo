package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HTTPServletDemo", urlPatterns = "/Product")
public class HTTPServletDemo extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HTTPServletDemo.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i < 10; i++) {
            resp.getWriter().println(new Product(i, "Product " + i , 0.1 + i));
        }
        resp.getWriter().close();
    }
}
