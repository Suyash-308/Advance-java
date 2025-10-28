import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/context2")
public class ContextReaderServlet2 {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext= req.getServletContext();
        PrintWriter writer=resp.getWriter();
        writer.println("Reading from servlet context object");
        writer.println(servletContext.getAttribute("username"));
    }
}
