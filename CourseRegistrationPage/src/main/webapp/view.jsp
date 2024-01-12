<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Registration Page</title>
</head>
<body>
<h2>Course Registration</h2>
<%
String url = "jdbc:mysql://localhost:3306/userdetail";
String username = "root";
String password = "root";

String courseId=request.getParameter("courseId");
String courseName=request.getParameter("courseName");
String courseDetails=request.getParameter("courseDetails");
String courseBudget=request.getParameter("courseBudget");
String joiningDate = request.getParameter("joiningDate");
String[] courseSelection=request.getParameterValues("courseSelection");

Connection connection = null;
PreparedStatement Statement = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
     connection = DriverManager.getConnection(url, username, password);
    
    String Query = "INSERT INTO courses (courseId, courseName, courseDetails, joiningDate, courseBudget) VALUES (?, ?, ?, ?, ?)";
    Statement = connection.prepareStatement(Query);
    Statement.setString(1, courseId);
    Statement.setString(2, courseName);
    Statement.setString(3, courseDetails);
    Statement.setString(4, joiningDate);
    Statement.setString(5, joiningDate);
    Statement.executeUpdate();
%>
<%
}
catch(Exception e){
	e.printStackTrace();
}
%>
<h2>Registration Confirmed</h2>
<a>Thank You for Register</a>
<p><strong>Course ID:</strong> <%= courseId %></p>
<p><strong>Course Name:</strong> <%= courseName %></p>
<p><strong>Course Details:</strong> <%= courseDetails %></p>
<p><strong>Joining Date:</strong> <%= joiningDate %></p>
<p><strong>Budget:</strong> <%= courseBudget %></p>
<p><strong>Selected Courses:</strong>
<%
for(String course : courseSelection ) {%>
	 <%= course%>
	 <%
		}%>
</body>
</html>