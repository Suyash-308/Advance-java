import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class HiServlet implements Servlet {
    public HiServlet(){
        System.out.println("HiServlet :Constructor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HiServlet : init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HiServlet : service method");
        servletResponse.getWriter().println("hi"+ LocalDateTime.now());

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("HiServlet : distroy method");


    }
}
