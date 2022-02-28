package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float first = Float.parseFloat(req.getParameter("first"));
        float second = Float.parseFloat(req.getParameter("second"));
        String operand = req.getParameter("operand");
        float result = Calculate.getCalculate(first, second, operand);
        resp.getWriter().println(first + " " + operand + " " + second + " = " + result);
    }

}
