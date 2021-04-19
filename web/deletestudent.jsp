<%-- 
    Document   : deletestudent
    Created on : Dec 27, 2020, 9:12:54 PM
    Author     : kalyani
--%>

<%@page import="jspdatabase.*"%>  
<jsp:useBean id="stud" class="jspdatabase.Student"></jsp:useBean>  
<jsp:setProperty property="*" name="stud"/>  
<%  
StudentDao.delete(stud);  
response.sendRedirect("viewstudent.jsp");  
%>  
