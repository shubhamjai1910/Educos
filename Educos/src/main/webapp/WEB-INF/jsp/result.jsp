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
<link rel="stylesheet" type="text/css" href="/static/css/dropdown.css">
<link rel="stylesheet" type="text/css" href="/static/css/logincss.css">
</head>
<img style="height: 100px; vertical-align: middle; width: 100px;"
			src="https://png.pngtree.com/element_our/sm/20180329/sm_5abc881cb2505.png">
<h1 style="color:white">Edu<span style="color: #F39C12">Cos</span></h1>&nbsp<h3 style="color:white">Learn</h3>

<section class='login' id='login'>
	<div class='head'>
		<img style="height: 100px; width: 100px;"
			src="https://png.pngtree.com/element_our/sm/20180329/sm_5abc881cb2505.png">
			<spring:url value="/educos/resultsave" var="saveURL" />
		<h1 class='company'>EDUCOS STUDENTS RECORD</h1>
	</div>

	<div class='form'>
	<form:form  method="POST" modelAttribute="results" action="${saveURL}" >
		



			Select Student 
			  <form:select class="dropbtn"  path="sid">

                <form:option value="" label="Select Student"/>
                 <c:forEach items="${students}" var="stu">
              <%--   <form:option value="${stu.sid}" items="${stu.sname}"/> --%>
                  <option value="${stu.sid}">${stu.sname}</option>
                  </c:forEach>
            </form:select>
<br>
			<br>




			<tr>
				<td>Enter Student Name</td>
			<form:input type="text" path="name" id="name" class='text' />
				<br>
				<br>
			</tr>


			<tr>
				<td>Assignments Marking</td>
			<form:input type="text" path="assignmentrecord" id="assignmentrecord" class='text'/>
				<br>
				<br>
			</tr>
			
			
			
			


			<tr>
				<td>Quiz Record</td>
				<form:input type="text" path="quizrecord" id="quizrecord" class='text'/>
				<br>
				<br>
			</tr>


			<tr>
				<td>Enter Assignment Attempts</td>
				<form:input type="text" path="assignmentattempt" id="assignmentattempt" class='text' />
				<br>
				<br>
			</tr>
            
           
            
            

			<tr>
				<td>Enter Quiz Attempts</td>
				<form:input type="text" path="quizattempt" id="quizattempt" class='text' />
			
				<br>
				<br>
			</tr>

  
             <button type="submit" class='btn-login'>Submit Entries</button>

		
		</form:form>
	</div>
</section>