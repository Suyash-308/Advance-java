import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;
@WebServlet("/login")
public class LogInServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String username= servletRequest.getParameter("username");
        String password= servletRequest.getParameter("password");

        servletResponse.getWriter().println("welcome"+username+"/t"+ LocalDateTime.now());
    }
}
