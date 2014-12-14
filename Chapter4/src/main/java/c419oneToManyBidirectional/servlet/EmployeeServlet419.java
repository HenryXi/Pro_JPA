package c419oneToManyBidirectional.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c419oneToManyBidirectional.model.Department419;
import c419oneToManyBidirectional.model.Employee419;
import c419oneToManyBidirectional.model.stateless.DepartmentService419;
import c419oneToManyBidirectional.model.stateless.EmployeeService419;

public class EmployeeServlet419 extends HttpServlet {

    private final String TITLE = 
        "Chapter 4: One-to-Many Bidirectional Example";
    
    private final String DESCRIPTION = 
        "This example demonstates how to specify one-to-many bidirectional relationships for entities.</br> " +
        "It allows you to create/find employees & departments and associate them.";

    
    @EJB
    EmployeeService419 empService;
    @EJB
    DepartmentService419 deptService;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        printHtmlHeader(out);
        
        // process request
        String action = request.getParameter("action");
        if (action == null) {
            // do nothing if no action requested
        } else if (action.equals("CreateEmp")) {
            Employee419 emp = empService.createEmployee(
                    request.getParameter("empName"),
                    parseLong(request.getParameter("salary")));
            out.println("Created " + emp);
        } else if (action.equals("CreateDept")) {
            Department419 dept = deptService.createDepartment(
                    request.getParameter("deptName"));
            out.println("Created " + dept);
        } else if (action.equals("SetEmployeeDept")) {
            Employee419 emp = empService.setEmployeeDepartment(
                    parseInt(request.getParameter("empId")),
                    parseInt(request.getParameter("deptId")));
            out.println("Updated " + emp + "</br>");
            out.println(emp.getDepartment() + " with Employees:</br>");
            out.println(emp.getDepartment().getEmployees());
        } else if (action.equals("FindAll")) {
            Collection<Employee419> emps = empService.findAllEmployees();
            if (emps.isEmpty()) {
                out.println("No Employees found ");
            } else {
                out.println("Found Employees: </br>");
                for (Employee419 emp : emps) {
                    out.println(emp + "<br/>");
                }
            }
            
            out.println("</br>");
            Collection<Department419> depts = deptService.findAllDepartments();
            if (depts.isEmpty()) {
                out.println("No Departments found ");
            } else {
                out.println("Found Departments: </br>");
                for (Department419 dept : depts) {
                    out.println(dept + " with " + dept.getEmployees().size() + " employees<br/>");
                }
            }
        }
        
        printHtmlFooter(out);
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    private int parseInt(String intString) {
        try {
            return Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    private long parseLong(String longString) {
        try {
            return Long.parseLong(longString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void printHtmlHeader(PrintWriter out) throws IOException {
        out.println("<body>");
        out.println("<html>");
        out.println("<head><title>" + TITLE + "</title></head>");
        out.println("<center><h1>" + TITLE + "</h1></center>");
        out.println("<p>" + DESCRIPTION + "</p>");
        out.println("<hr/>");
        out.println("<form action=\"EmployeeServlet419\" method=\"POST\">");
        // form to create and Employee and Department
        out.println("<h3>Create an Employee</h3>");
        out.println("<table><tbody>");
        out.println("<tr><td>Employee Name:</td><td><input type=\"text\" name=\"empName\"/>(String)</td></tr>");
        out.println("<tr><td>Employee Salary:</td><td><input type=\"text\" name=\"salary\"/>(long)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"CreateEmp\"/></td></tr>");
        out.println("</tbody></table>");

        out.println("<hr/>");
        out.println("<h3>Create a Department</h3>");
        out.println("<table><tbody>");
        out.println("<tr><td>Dept Name:</td><td><input type=\"text\" name=\"deptName\"/>(String)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"CreateDept\"/></td></tr>");
        out.println("</tbody></table>");
        
        out.println("<hr/>");
        out.println("<h3>Set an Employee's Department</h3>");
        out.println("<table><tbody>");
        out.println("<tr><td>Emp Id:</td><td><input type=\"text\" name=\"empId\"/>(int)</td></tr>");
        out.println("<tr><td>Dept Id:</td><td><input type=\"text\" name=\"deptId\"/>(int)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"SetEmployeeDept\"/></td></tr>");
        out.println("</tbody></table>");
        out.println("<hr/>");
        // form to find all
        out.println("<h3>Find all Employees & Departments</h3>");
        out.println("<input name=\"action\" type=\"submit\" value=\"FindAll\"/>");
        out.println("</form>");
        out.println("<hr/>");
    }
    
    
    private void printHtmlFooter(PrintWriter out) throws IOException {
        out.println("</html>");
        out.println("</body>");
        out.close();
    }
}
