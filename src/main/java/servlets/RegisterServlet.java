// RegisterServlet.java
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Register;
import dao.ToDoDAO;
import dao.ToDoDAOImpl;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

  // servlet lifecycle methods are
  /* 
  init()
  service()
  and destroy()
  from the service() method doPost(), doGet(), doHead(), doDelete(),
  doOptions() and doTrace() HTTP callback methods are called
  */
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // setting MIME type (Multipurpose Internet Mail Extension)
    // this will tell the browser what type of response we are     // sending from servlet
    response.setContentType("text/html");
    
    // to write output from servlet onto browser
    PrintWriter out=response.getWriter();
    
    // reading form data
    // reading request parameters
    String fname=request.getParameter("fname").trim();
    String lname=request.getParameter("lname").trim();
    String email=request.getParameter("email").trim();
    String pass=request.getParameter("pass").trim();
    long mobile=Long.parseLong(request.getParameter("mobile").trim());
    String address=request.getParameter("address").trim();
    
    // store the form data into Register bean object
    Register reg=new Register(0,fname,lname,email,pass,mobile,address);
    
    // create DAO object    
    ToDoDAO dao=ToDoDAOImpl.getInstance();
    
    int regId=dao.register(reg);
    
    if(regId>0)
      response.sendRedirect("./Login.jsp");
    else
      response.sendRedirect("./Register.html");
  }
}