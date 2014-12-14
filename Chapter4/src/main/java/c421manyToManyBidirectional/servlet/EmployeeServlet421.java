package c421manyToManyBidirectional.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c421manyToManyBidirectional.model.Employee421;
import c421manyToManyBidirectional.model.Project421;
import c421manyToManyBidirectional.model.stateless.EmployeeService421;
import c421manyToManyBidirectional.model.stateless.ProjectService421;

public class EmployeeServlet421 extends HttpServlet {

    private final String TITLE = 
        "Chapter 4: Many-to-Many Bidirectional Example";
    
    private final String DESCRIPTION = 
        "This example demonstates how to specify many-to-many bidirectional relationships for entities.</br> " +
        "It allows you to create/find employees & projects and associate them.";

    
    @EJB
    EmployeeService421 empService;
    @EJB
    ProjectService421 projService;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        printHtmlHeader(out);
        
        // process request
        String action = request.getParameter("action");
        if (action == null) {
            // do nothing if no action requested
        } else if (action.equals("CreateEmp")) {
            Employee421 emp = empService.createEmployee(
                    request.getParameter("empName"),
                    parseLong(request.getParameter("salary")));
            out.println("Created " + emp);
        } else if (action.equals("CreateProject")) {
            Project421 proj = projService.createProject(
                    request.getParameter("projName"));
            out.println("Created " + proj);
        } else if (action.equals("addEmployeeProject")) {
            Employee421 emp = empService.addEmployeeProject(
                    parseInt(request.getParameter("empId")),
                    parseInt(request.getParameter("projId")));
            out.println("Updated " + emp + "</br>");
        } else if (action.equals("FindAll")) {
            Collection<Employee421> emps = empService.findAllEmployees();
            if (emps.isEmpty()) {
                out.println("No Employees found ");
            } else {
                out.println("Found Employees: </br>");
                for (Employee421 emp : emps) {
                    out.println(emp + "<br/>");
                }
            }
            
            out.println("</br>");
            Collection<Project421> projs = projService.findAllProjects();
            if (projs.isEmpty()) {
                out.println("No Projects found ");
            } else {
                out.println("Found Projects: </br>");
                for (Project421 proj : projs) {
                    out.println(proj + "<br/>");
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
        out.println("<form action=\"EmployeeServlet421\" method=\"POST\">");
        // form to create and Employee and Department
        out.println("<h3>Create an Employee</h3>");
        out.println("<table><tbody>");
        out.println("<tr><td>Employee Name:</td><td><input type=\"text\" name=\"empName\"/>(String)</td></tr>");
        out.println("<tr><td>Employee Salary:</td><td><input type=\"text\" name=\"salary\"/>(long)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"CreateEmp\"/></td></tr>");
        out.println("</tbody></table>");
        out.println("<hr/>");
        out.println("<table><tbody>");
        out.println("<tr><td>Project Name:</td><td><input type=\"text\" name=\"projName\"/>(String)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"CreateProject\"/></td></tr>");
        out.println("</tbody></table>");
        out.println("<hr/>");
        
        out.println("<table><tbody>");
        out.println("<tr><td>Emp Id:</td><td><input type=\"text\" name=\"empId\"/>(int)</td></tr>");
        out.println("<tr><td>Project Id:</td><td><input type=\"text\" name=\"projId\"/>(int)</td></tr>");
        out.println("<td><input name=\"action\" type=\"submit\" value=\"addEmployeeProject\"/></td></tr>");
        out.println("</tbody></table>");
        out.println("<hr/>");
        // form to find all
        out.println("<h3>Find all Employees & Projects</h3>");
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
