<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" type="text/css" href="/static/css/profile.css">
 <link rel="stylesheet" type="text/css" href="/static/css/home.css">
 <link rel="stylesheet" type="text/css" href="/static/css/footer.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Educos Learn</title>
</head>
<body>
 <div style="background-color: #16A085">
 <div class="brand">
   <img style="height: 100px; vertical-align: middle; width: 100px;"
			src="https://png.pngtree.com/element_our/sm/20180329/sm_5abc881cb2505.png"><a href="#!">Edu<span style="color:#D68706">Cos</span><span style="font-size: 20px">Learn</span></a>
    </div><br/><br><br/><br>
     &nbsp;
<section class="navigation">
  <div class="nav-container">
   
    <nav>
      <div class="nav-mobile">
        <a id="nav-toggle" href="#!"><span></span></a>
      </div>
    
      <ul class="nav-list">
        <!-- Setting the links to #! will ensure that no action takes place on click. -->
        <c:if test="${name.roleid == 1}">
        <li><a href="/educos/home">Home</a></li>
          <li><a href="/educos/flist">Faculties</a></li>
            <li><a href="/educos/slist">Students</a></li>
            <li><a href="/educos/facultyadd">Add Faculty</a></li>
            
              <li><a href="/educos/">Assignments</a></li>
              <li><a href="#">Quiz</a></li>
              <li><a href="#">Result</a></li>
               <li><a href="#">Online Session</a></li>
             
               
        <li><a href="#!">About</a></li>
        <li><a href="#!">Contact</a></li>
        <br>
        <br></c:if>
         <c:if test="${name.roleid ==2}">
        <li><a href="/educos/home">Home</a></li>
         
            <li><a href="/educos/slist">Students</a></li>
              <li><a href="/educos/">Assignments</a></li>
              <li><a href="#">Quiz</a></li>
              <li><a href="#">Result</a></li>
               <li><a href="#">Online Session</a></li>
             
               
        <li><a href="#!">About</a></li>
        <li><a href="#!">Contact</a></li>
        <br>
        <br></c:if>
        
         <c:if test="${names.roleid ==3} }">
        <li><a href="/educos/home">Home</a></li>
            
              <li><a href="/educos/">Assignments</a></li>
              <li><a href="#">Quiz</a></li>
              <li><a href="#">Result</a></li>
               <li><a href="#">Online Session</a></li>
             
               
        <li><a href="#!">About</a></li>
        <li><a href="#!">Contact</a></li>
        <br>
        <br></c:if>
       
</div>
        
      </ul>
    </nav>
  </div>
</section>
</div>

  <div class="dropdown" style="float:right;">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">${name.fname} ${names.sname}
    <span class="caret"></span></button>
    <ul class="dropdown-menu">

      <li><a href="/educos/logout">Logout</a></li>
    
    </ul>
  </div>


<br><br><br><br>
<div class="placeholder">
  
    <center><h1 style="color:#024F40; margin-top: 1cm">Profile</h1></center>
    
    <center><img src="http://www.iconarchive.com/download/i87178/graphicloads/colorful-long-shadow/User.ico"/></center>
  
  <center>   <table>
       <tr>
       
        <td>${name.fname} ${names.sname} </td>
        
       </tr>
       <tr>
       
        <td>${name.fsubjects} ${names.stream} </td>
        
       </tr>
       <tr>
       
        <td>${name.faddress} ${names.semail} </td>
        
       </tr>
       <tr>
       
        <td>${name.femail} ${names.sgender} </td>
        
       </tr>
       <tr>
       
        <td>${name.fgender} ${names.scontact} </td>
        
       </tr>
       <tr>
       
        <td>${name.fcontact} ${names.saddress} </td>
        
       </tr>
       
     </table></center>

</div>
<br><br><br><br>
<footer style="margin-bottom: 40px;height:600px;">
		<div class="content">
			<div id="emailsignup">
				<a href="https://www.Educos.com/" >EduCos Learn</a>
				<p>Only the platform for students to learn every thing with faculties & byself using Resources<br style="margin: 0 0 12px 0;"><a href="//www.proxibid.com/marketingimages/masterblaster.html">View this week's newsletter</a></p>
				<p><a href="http://proxibidcontent.com/email-sign-up" class="btn" style="display:inline-block;">Sign up for our newsletter</a></p>
			</div>
			<div id="helpfullinks">
				<div>
					<p class="category"><a href="http://proxibidcontent.com/about-us/">About us</a></p>
					<ul>
						<li><a href="https://www.proxibid.com/asp/Help.asp">Help</a></li>
						<li><a href="https://www.proxibid.com/asp/contactus.asp">Contact us</a></li>
						<li><a href="http://proxibidcontent.com/leadership/">Leadership</a></li>
						<li><a href="http://proxibidcontent.com/careers/">Careers</a></li>
						<li><a href="http://proxibidcontent.com/our-newsroom/">Newsroom</a></li>
							</ul>
				</div>
			
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
			<div style="background: white; color:#1C2833; width:1000px;">
			<div id="poweredby">
				<p>Powered by EduCos   }</p>
				<ul>
					<li><a target="_blank" href="http://www.orlando.co.in/" class="footer-ora">Orlando Academy</a></li>

				</ul>
			</div>
			</div>
			<div class="clear"></div>
			<div id="social">
				<ul class="social">
					<li><a target="_blank" href="https://www.facebook.com">Facebook</a></li>
					<li><a target="_blank" href="https://twitter.com">Twitter</a></li>
					<li><a target="_blank" href="https://www.youtube.com">YouTube</a></li>
					<li class="last"><a target="_blank" href="https://www.linkedin.com">LinkedIn</a></li>
				</ul>
				<div class="clear"></div>
				<ul class="contact">
					<li class="last">@2019 Educos Group & Development Team</li>
				</ul>
			
	</footer>
</body>

</html>