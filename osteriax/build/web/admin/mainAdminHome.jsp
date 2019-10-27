<%-- 
    Document   : mainAdminHome
    Created on : Oct 18, 2019, 12:17:40 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminHome-OsteriX</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body background="../img/first.jpg">
        <jsp:include page="headers.jsp" />
        <br><br><br>
        <div align="center">
            <h1><font color="green">Hello Admin</font></h1>
        </div>
        
      
<div class="container">
 
          <a href="requestDisplay1.jsp"> <button type="button" class="btn btn-lg btn-block btn-primary">Click me! to display Clinic Requests</button></a>
          <br>
      
          <a href="showDisplay.jsp"><button type="button" class="btn btn-lg btn-block btn-secondary">Click me! to Display/Remove Registered </button></a>
          <br>
     
          <a href="adminsignup.jsp"> <button type="button" class="btn btn-lg btn-block btn-danger ">Click me! to Declare new Admin</button></a>
          <br>
      
          <a href="deleteAdmin.jsp"><button type="button" class="btn btn-lg btn-block btn-info">Click me! to Delete current Admins</button></a>
          <br>
      
        <button type="button" class="btn btn-lg btn-block btn-light">Click me!</button>
      </div>
  
      

        
       
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
