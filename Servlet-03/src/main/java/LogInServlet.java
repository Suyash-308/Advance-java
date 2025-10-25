import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username= req.getParameter("username");
       String password=req.getParameter("password");
       resp.setContentType("text/html");

       if("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)){
           RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
           requestDispatcher.forward(req, resp);
       }else {
           resp.getWriter().println("<h1 style= \" color:red\" >Invalid Credential</h1>");
           RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
           requestDispatcher.include(req,resp);
       }
    }
}
