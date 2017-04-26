<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
        <header>
            <img src="images/tobalogo.PNG" alt="TOBA LOGO">
        </header>
       <nav>
            <ul>
                <li><a href="index.jsp">HOME</a></li>
                <li><a href="login.jsp">LOGIN</a></li>
                <li><a href="new_customer.jsp">NEW CUSTOMER</a></li>
            </ul>
        </nav>
        <section>
            <h3>Invalid login, please try again</h3><br>
            <a href="login.jsp"><h3>Login</h3></a>
        </section>
        <c:import url="/includes/footer.jsp" />
