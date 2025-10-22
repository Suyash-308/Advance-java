import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jdk.vm.ci.meta.Local;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/greet")

public class GreetingServlet implements Servlet {

     public GreetingServlet(){
        System.out.println("constructor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
   System.out.println("service method");
        servletResponse.getWriter().println("Hello"+LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("distroy method");

    }
}
