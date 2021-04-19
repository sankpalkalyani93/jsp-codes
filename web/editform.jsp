<%-- 
    Document   : editstudent
    Created on : Dec 27, 2020, 9:12:39 PM
    Author     : kalyani
--%>
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Edit Form</title>  
</head>  
<body>  
    <%@page import="jspdatabase.*"%>  
  
    <%  
        String id=request.getParameter("id");  
        Student stud=StudentDao.getRecordById(Integer.parseInt(id));  
    %>  
  
    <h1>Edit Form</h1>  
    <form action="editstudent.jsp" method="post">  
        <input type="hidden" name="id" value="<%=stud.getId() %>"/>  

        <table>
        <tr><td>ID:</td><td>  
        <input type="text" name="id" value="<%= stud.getId()%>"/></td></tr>  
        <tr><td>Name:</td><td>  
        <input type="text" name="name" value="<%= stud.getName()%>"/></td></tr>  
        <tr><td>Password:</td><td>  
        <input type="password" name="password" value="<%= stud.getPassword()%>"/></td></tr>  
        <tr><td>Email:</td><td>  
        <input type="email" name="email" value="<%= stud.getEmail()%>"/></td></tr>  
        <tr><td>Gender:</td><td>  
        <input type="radio" name="sex" value="male"/>Male   
        <input type="radio" name="sex" value="female"/>Female </td></tr>  
        <tr><td>Country:</td><td>  
        <select name="country">  
            <option>India</option>  
            <option>America</option>  
            <option>Afghanistan</option>  
            <option>Sri Lanka</option>  
            <option>Australia</option>  
        </select>  
        </td></tr>  
        <tr><td colspan="2"><input type="submit" value="Edit Student"/></td></tr>  
        </table>  
    </form>  
  
</body>  
</html>  