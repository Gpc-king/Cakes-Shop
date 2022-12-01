package filter;

import model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;

//@WebFilter(filterName = "AdminFilter" , urlPatterns = "/admin/*")
//public class AdminFilter implements Filter {
//    public void destroy(){
//        Filter.super.destroy();
//        try{
//            DriverManager.deregisterDriver(DriverManager.getDrivers().nextElement());
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//    }
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest)req;
//        HttpServletResponse requesp = (HttpServletResponse)resp;
//        User u = (User) request.getSession().getAttribute("user");
//        if(u==null || u.isIsadmin()==false){
//            requesp.sendRedirect("../index.jsp");
//        }else{
//            chain.doFilter(req,resp);
//        }
//    }
//    public void init(FilterConfig config)throws ServletException{
//
//    }
//}
