import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter(urlPatterns = {"/s1", "/s2", "/s3"})
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Custom filter :: init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Custom filter :: doFilter");
        String username= servletRequest.getParameter("username");
        String password= servletRequest.getParameter("password");
if ("admin".equalsIgnoreCase(username)&&"admin".equalsIgnoreCase(password)){
    filterChain.doFilter(servletRequest,servletResponse);
}else {
    servletResponse.getWriter().println("Invalid Credentials");
}
    }

    @Override
    public void destroy() {
        System.out.println("Custom filter :: distroy");
    }
}
