<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>New Customer</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/main.css">
    </head>
    <body>
        <header>
        <h1>Titan Online Banking Application</h1>
        </header>
        <nav>
            <ul>
                <li><a href="index.html">HOME</a></li>
                <li><a href="login.html">LOGIN</a></li>
                <li><a href="new_customer.html">NEW CUSTOMER</a></li>
            </ul>
        </nav>
        <section>
            <p class="error">${message}</p>
                <form action="newCustomer" method="POST">
                <h3>New Customer Sign Up</h3><br>
                <label>First Name:</label><br>
                <input type="text" name="firstName" value="${firstName}"><br>
                <label>Last Name:</label><br>
                <input type="text" name="lastName" value="${lastName}"><br>
                <label>Phone:</label><br>
                <input type="text" name="phone" value="${phone}"><br>
                <label>Address:</label><br>
                <input type="text" name="address" value="${address}"><br>
                <label>City:</label><br>
                <input type="text" name="city" value="${city}"><br>
                <label>State:</label><br>
                <input type="text" name="state" value="${state}"><br>
                <label>Zip Code:</label><br>
                <input type="text" name="zipCode" value="${zipCode}"><br>
                <label>Email:</label><br>
                <input type="email" name="email" value="${email}"><br>
                <input type="submit" value="Register">
            </form>
        </section>
        <footer>Copyright &copy; toba.com</footer>
    </body>
</html>
