<%@page import="jspdatabase.*"%>  
<jsp:useBean id="stud" class="jspdatabase.Student"></jsp:useBean>  
<jsp:setProperty property="*" name="stud"/>  
<%  
int i=StudentDao.update(stud);  
response.sendRedirect("viewstudent.jsp");  
%>  