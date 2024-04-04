<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Sign Up</title>
        <style>
            p {
                color: red;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <h1>Sign Up</h1>


    <c:if test="${not empty requestScope.errsusername}">
        <p>${requestScope.errsusername.usernameErrs}</p>
    </c:if>


    <c:if test="${not empty requestScope.errspassword}">
        <p>${requestScope.errspassword.passwordErrs}</p>
    </c:if>


    <c:if test="${not empty requestScope.errsconfirmpassword}">
        <p>${requestScope.errsconfirmpassword.confirmErrs}</p>
    </c:if>


    <c:if test="${not empty requestScope.errsfullname}">
        <p>${requestScope.errsfullname.lastnameErrs}</p>
    </c:if>


    <c:if test="${not empty requestScope.duplicated}">
        <p>${requestScope.duplicated.duplicateUsername}</p>
    </c:if>
    <form action="./signup" method="POST">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        Confirm Password: <input type="password" name="confirm"><br>
        Full Name: <input type="text" name="fullname"><br>
        <input type="hidden" name="action" value="signup">
        <input type="submit" value="Sign Up">
    </form>
</body>
</html>
