<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<%@ page import="servlet.Employee" %>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Excel Project</title>
   </head>
   <body>
      <h1>Export to Excel Assignment</h1>
      <form action="exporttoexcel" method="post">
         <table cellpadding="1"  cellspacing="1" border="1" bordercolor="gray">
            <tr>
               <td>First Name</td>
               <td>Town</td>
               <td>Age</td>
            </tr>
            <%
               List<Employee> employees  = (List<Employee>)request.getAttribute("employees");
               for(Employee e: employees){
               %>
            <tr>
               <td><%=e.getFirstName()%></td>
               <td><%=e.getTown()%></td>
               <td><%=e.getAge()%></td>
            </tr>
            <%
               }
               %>
         </table>
         <input type="submit" value="Export To Excel"/>
      </form>
   </body>
</html>