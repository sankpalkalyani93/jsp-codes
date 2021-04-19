<%-- 
    Document   : viewstudent
    Created on : Dec 27, 2020, 9:06:58 PM
    Author     : kalyani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%@page import="jspdatabase.*,java.util.*"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
    <h1>Student List</h1>  
  
    <%  
        List<Student> list=StudentDao.getAllRecords();  
        request.setAttribute("list",list);  
    %>  
  
    <table border="1" width="90%">  
        <tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th>  
        <th>Gender</th><th>Country</th><th>Edit</th><th>Delete</th></tr>  
        <c:forEach items="${list}" var="stud">  
        <tr><td>${stud.getId()}</td><td>${stud.getName()}</td><td>${stud.getPassword()}</td>  
        <td>${stud.getEmail()}</td><td>${stud.getGender()}</td><td>${stud.getCountry()}</td>  
        <td><a href="editform.jsp?id=${stud.getId()}">Edit</a></td>  
        <td><a href="deletestudent.jsp?id=${stud.getId()}">Delete</a></td></tr>  
        </c:forEach>  
    </table>  
    
    <br/><a href="addstudent.jsp">Add New Student</a>  
  
</body>  
</html>
