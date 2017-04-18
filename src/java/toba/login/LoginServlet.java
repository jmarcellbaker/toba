package toba.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import toba.user.User;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "login";
        }
        
        if (action.equals("login")) {

            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String url = "";

            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                
                url = "/account_activity.jsp";
                
                getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);  
            }
            else {
                url = "/login_failure.jsp";

                getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
            }
            
            session.setAttribute("user", user);
            
            processRequest(request, response);
        }
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
