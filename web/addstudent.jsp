<%-- 
    Document   : addstudent
    Created on : Dec 27, 2020, 8:41:24 PM
    Author     : kalyani
--%>

<%@page import="jspdatabase.StudentDao"%>  
<jsp:useBean id="stud" class="jspdatabase.Student"></jsp:useBean>  
<jsp:setProperty property="*" name="stud"/>  
  
<%  
int i=StudentDao.save(stud);  
if(i>0){  
response.sendRedirect("addstudent_success.jsp");  
}else{  
response.sendRedirect("addstudent_error.jsp");  
}  
%>  