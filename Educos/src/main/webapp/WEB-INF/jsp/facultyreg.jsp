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
			<spring:url value="/educos/save" var="saveURL" />
		<h1 class='company'>EDUCOS FACULTY REGISTRATION</h1>
	</div>

	<div class='form'>
	<form:form  method="POST" modelAttribute="faculties" action="${saveURL}" >
		



			Faculty Name 
			<form:input type="text" path="fname" id="fname" class='text' /><br>
			<br>




			<tr>
				<td>Faculty Subjects</td>
			<form:input type="text" path="fsubjects" id="fsubjects" class='text' />
				<br>
				<br>
			</tr>


			<tr>
				<td>Faculty Address</td>
			<form:input type="text" path="faddress" id="faddress" class='text'/>
				<br>
				<br>
			</tr>
			
			
			<tr>
				<td>Gender</td>
			<form:radiobutton path="fgender" value="Male"/>Male
			<form:radiobutton path="fgender" value="Female"/>Female
			
				<br>
				<br>
			</tr>
			


			<tr>
				<td>Faculty Email</td>
				<form:input type="text" path="femail" id="femail" class='text'/>
				<br>
				<br>
			</tr>


			<tr>
				<td>Faculty Contact</td>
				<form:input type="text" path="fcontact" id="fcontact" class='text' />
				<br>
				<br>
			</tr>
            
           
            
            

			<tr>
				<td>Password</td>
				<form:input type="text" path="fpassword" id="fpassword" class='text' />
			
				<br>
				<br>
			</tr>

			<tr>
				<td>Retype Password</td>
				<form:input type="text" path="frepassword" id="frepassword" class='text' />
				
				<br>
				<br>
			</tr>
  
             <button type="submit" class='btn-login'>Register</button>

		
		</form:form>
	</div>
</section>