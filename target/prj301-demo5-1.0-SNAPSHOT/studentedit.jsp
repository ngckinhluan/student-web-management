<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>

        <jsp:include page="/menu.jsp" flush="true" /> 
        <h1>Student Edit </h1>

        <p>Login user: ${sessionScope.usersession.username}</p>
        <form action="StudentController" method="POST">
            <table border="2">
                <tr><td>Id</td> <td>
                        <input name="id" value="${requestScope.student.id}" type="hidden">
                        ${requestScope.student.id}
                    </td></tr>
                <tr><td>First name</td><td><input name="firstname" value="${requestScope.student.firstname}"></td></tr>
                <tr><td>Last name</td><td><input name="lastname" value="${requestScope.student.lastname}"></td></tr>
                <tr><td>Age</td><td><input name="age" value="${requestScope.student.age}"></td></tr>
                <tr><td colspan="2">
                        <input name="action" value="${requestScope.nextaction}" type="hidden">
                        <input type="submit" value="Save">
                    </td></tr>

            </table>
        </form>






    </body>
</html>
