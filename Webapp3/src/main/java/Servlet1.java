import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");

            out.println("<h1>Servlet1 Response</h1>");

            RequestDispatcher rd = req.getRequestDispatcher("/s2");
            rd.include(req, res);
        } catch (Exception e) {

        }
    }
}
