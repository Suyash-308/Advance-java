import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(value = "/greet" ,loadOnStartup = 2)
public class GreetServlet implements Servlet {

    public GreetServlet(){
        System.out.println("greet :Constructor");
    }

    @Override

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("greet: init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("greet : service method");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("greet :distroy method");
    }
}
