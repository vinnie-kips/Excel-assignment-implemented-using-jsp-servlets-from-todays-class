package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExportToExcel extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List employees = new ArrayList();
        employees.add(new Employee("John", "Kisumu", "24"));
        employees.add(new Employee("Newton", "Nairobi", "26"));
        employees.add(new Employee("Mike", "Kisii", "37"));
        request.setAttribute("employees", employees);
        RequestDispatcher rd = request.getRequestDispatcher("report.jsp");
        rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List employees = new ArrayList();
        employees.add(new Employee("John", "Kisumu", "24"));
        employees.add(new Employee("Newton", "Nairobi", "26"));
        employees.add(new Employee("Mike", "Kisii", "37"));
        request.setAttribute("employees", employees);
        RequestDispatcher rd = request.getRequestDispatcher("excelreport.jsp");
        rd.forward(request, response);
    }
}