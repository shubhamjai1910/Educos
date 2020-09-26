<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html lang="en">
<head>
<style type="text/css">
td {
	color: white;
}
</style>
<link rel="stylesheet" type="text/css" href="/static/css/logincss.css">
</head>
<img style="height: 100px; vertical-align: middle; width: 100px;"
			src="https://png.pngtree.com/element_our/sm/20180329/sm_5abc881cb2505.png">
<h1 style="color:white">Edu<span style="color: #F39C12">Cos</span></h1>&nbsp<h3 style="color:white">Learn</h3>

<section class='login' id='login'>
	<div class='head'>
		<img style="height: 100px; width: 100px;"
			src="https://png.pngtree.com/element_our/sm/20180329/sm_5abc881cb2505.png">
			<spring:url value="/educos/savestudent" var="saveURL" />
		<h1 class='company'>EDUCOS STUDENT REGISTRATION</h1>
	</div>

	<div class='form'>
	<form:form modelAttribute="Students" method="post" action="${saveURL }" cssClass="form">
		

             <tr>
             <td>Student Name</td>
			 <form:input type="text" path="sname" id="sname" class='text'/><br>
			<br>
            </tr>
            


			<tr>
				<td>Student Stream</td>
			<form:input type="text" path="stream" id="stream" class='text'/>
				<br>
				<br>
			</tr>


						<tr>
				<td>Gender</td>
			<form:radiobutton path="sgender" value="Male"/>Male
			<form:radiobutton path="sgender" value="Female"/>Female
			
				<br>
				<br>
			</tr>



			<tr>
				<td>Student Address</td>
				<form:input type="text" path="saddress" id="saddress" class='text'/>
				<br>
				<br>
			</tr>


			<tr>
				<td>Student Contact</td>
				<form:input type="text" path="scontact" id="scontact" class='text'/>
				<br>
				<br>
			</tr>
            
           
            <tr>
				<td>Student Email</td>
				<form:input type="text" path="semail" id="semail" class='text'/>
				<br>
				<br>
			</tr>
            

			<tr>
				<td>Password</td>
				<form:input type="text" path="spassword" id="spassword" class='text'/>
			
				<br>
				<br>
			</tr>

			<tr>
				<td>Retype Password</td>
				<form:input type="text" path="srepassword" id="srepassword" class='text'/>
				
				<br>
				<br>
			</tr>
  
             <button type="submit" class='btn-login'>Register</button>
    </form:form>
			 <a href="#" class='forgot'>Forgot?</a>
		
	</div>
</section>