package toba.newcustomer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import toba.user.User;

public class NewCustomerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
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
        
        String url = "/index.jsp";
        String firstName = "";
        String lastName = "";
        String phone = "";
        String address = "";
        String city = "";
        String state = "";
        String zipCode = "";
        String email = "";
        String userName = "";
        String password = "";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "newCustomer";
        }
        
        if (action.equals("newCustomer")) {
            firstName = request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            phone = request.getParameter("phone");
            address = request.getParameter("address");
            city = request.getParameter("city");
            state = request.getParameter("state");
            zipCode = request.getParameter("zipCode");
            email = request.getParameter("email");


            User user = new User(firstName, lastName, phone, address, city, state,
                                zipCode, email, firstName + zipCode, "welcome1");

            HttpSession session = request.getSession();

            session.setAttribute("user", user);

            String message;
        
            
            if (firstName == null || lastName == null || phone == null || address == null || 
                city == null || state == null || zipCode == null || email == null ||
                firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || 
                city.isEmpty() || state.isEmpty() || zipCode.isEmpty() || email.isEmpty()) {

                message = "Please fill out all the form fields";
                request.setAttribute("message", message);
                url = "/new_customer.jsp";
            }

            else {
                message = "";
                request.setAttribute("message", message);
                url = "/success.jsp";
            }
        }

            
        //request.setAttribute("message", message);
            
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
