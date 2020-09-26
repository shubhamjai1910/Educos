<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>

<script src="http://code.jquery.com/jquery-2.1.0.min.js"></script>
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
        <c:if test="${names.roleid==0}">
        <li><a href="/educos/home">Home</a></li>
            
              <li><a href="/educos/">Assignments</a></li>
              <li><a href="#">Quiz</a></li>
              <li><a href="/educos/resultlist">Result</a></li>
               <li><a href="#">Online Session</a></li>
             
               
        <li><a href="#!">About</a></li>
        <li><a href="#!">Contact</a></li>
        <br>
        <br>   
        </c:if>
        <c:if test="${name.roleid == 1}">
        <li><a href="/educos/home">Home</a></li>
          <li><a href="/educos/flist">Faculties</a></li>
            <li><a href="/educos/slist">Students</a></li>
            <li><a href="/educos/facultyadd">Add Faculty</a></li>
            
              <li><a href="/educos/">Assignments</a></li>
              <li><a href="#">Quiz</a></li>
              <li><a href="/educos/resultlist">Result</a></li>
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
       
       
</div>
        
      </ul>
    </nav>
  </div>
</section>
</div>

  <div class="dropdown" style="float:right;">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">${name.fname}${names.sname}
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
  
   <li><a href="/educos/fprofile">Profile</a></li>
      <li><a href="/educos/logout">Logout</a></li>
      
    
    </ul>
  </div>


<br><br><br><br>
<div class="placeholder">
  
    <h1></h1>
  


  
<div id="slide" class="slide">
  <ul class="slide_list">
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
    <li><img src="//placehold.it/960x264/5ec5ce/ffffff"></li>
    <li><img src="//placehold.it/960x264/75aee6/ffffff"></li>
  </ul>
</div>
  

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
	<script type="text/javascript">

	var Animation = (function() {
		  var Slide = function(config) {
		    this.config = typeof config === 'object' ? config : {};
		    this.targetElement = this.config.target || 'slide';
		    // show slide marker
		    this.showMarker = this.config.showMarker || false;
		    this.mark = this.config.marker || false;
		    this.marker = this.config.setClass && this.config.setClass.marker || '';
		    this.active = this.config.setClass && this.config.setClass.active || '';
		    this.unactive = this.config.setClass && this.config.setClass.unactive || '';
		    // show left and right controller
		    this.showController = this.config.showController || false;
		    this.controllerPrev = this.config.setClass && this.config.setClass.controllerPrev || '';
		    this.controllerNext = this.config.setClass && this.config.setClass.controllerNext || '';

		    this.miliTime = this.config.miliTime || 50;
		    this.aboutTime = this.config.aboutTime || 3000;
		    this.currentTimer = null;
		    this.timer = null;
		    this.speed = 0;
		    this.nextPic = 0;

		    this.init();
		    this.handleEvent();
		  };

		  Slide.prototype = {
		    init: function() {
		      this.oTarget = document.getElementById(this.targetElement);
		      this.oUl = this.oTarget.getElementsByTagName('ul')[0];
		      var oULi = this.oUl.getElementsByTagName('li');
		      this.width = oULi[0].offsetWidth;
		      this.number = oULi.length;
		      this.oUl.style.width = this.number * this.width + 'px';
		      this.start = this.oUl.offsetLeft;

		      // marker
		      if (this.showMarker) {
		        var oOl = document.createElement('ol'),
		          oOlis = [];

		        oOl.className = this.marker;

		        for (var i = 1; i <= this.number; i++) {
		          this.mark ? oOlis.push('<li class="' + this.unactive + '">' + i + '<\/li>') : oOlis.push('<li class="' + this.unactive + '">' + "" + "<\/li>");
		        }

		        oOl.innerHTML = oOlis.join('');
		        this.oTarget.appendChild(oOl);

		        this.oOli = oOl.getElementsByTagName('li');
		        this.oOli[0].className = this.active;
		      }

		      // controller
		      if (this.showController) {
		        this.oPrev = document.createElement('span');
		        this.oNext = document.createElement('span');
		        this.oPrev.className = this.controllerPrev;
		        this.oNext.className = this.controllerNext;

		        this.oTarget.appendChild(this.oPrev);
		        this.oTarget.appendChild(this.oNext);
		      }
		    },

		    handleEvent: function() {
		      var that = this;
		      this.currentTimer = setInterval(function() {
		        that.next();
		      }, this.aboutTime);

		      // initialize the addEvent function
		      this.addEvent();

		      this.addEvent(this.oTarget, 'mouseover', function() {
		        clearInterval(that.currentTimer);
		      });

		      this.addEvent(this.oTarget, 'mouseout', function() {
		        that.currentTimer = setInterval(function() {
		          that.next();
		        }, that.aboutTime);
		      });

		      if (this.showMarker) {
		        for (var i = 0; i < this.number; i++) {
		          var element = this.oOli[i];
		          (function(i) {
		            that.addEvent(element, 'mouseover', function() {
		              that.go(i);
		            });
		          })(i);
		        }
		      }

		      if (this.showController) {
		        this.addEvent(this.oPrev, 'click', function() {
		          that.prev();
		        });

		        this.addEvent(this.oNext, 'click', function() {
		          that.next();
		        });
		      }
		    },

		    prev: function() {
		      this.go(--this.nextPic);
		    },

		    next: function() {
		      this.go(++this.nextPic);
		    },

		    go: function(index) {
		      if (index < 0) index = this.number - 1;
		      if (index >= this.number) index = 0;

		      var that = this,
		        left = -index * this.width;

		      this.nextPic = index;

		      if (this.showMarker) {
		        for (var i = 0; i < this.number; i++) {
		          i === index ? this.oOli[i].className = this.active : this.oOli[i].className = this.unactive;
		        }
		      }

		      if (this.timer) {
		        clearInterval(this.timer);
		      }

		      this.timer = setInterval(function() {
		        that.move(left);
		      }, this.miliTime);
		    },

		    move: function(left) {
		      this.oUl.style.left = this.speed + 'px';
		      leftOffset = this.oUl.offsetLeft - this.start;
		      this.speed += (left - leftOffset) / 3;

		      if (Math.abs(left - leftOffset) === 0) {
		        this.oUl.style.left = left + 'px';
		        clearInterval(this.timer);
		        this.timer = null;
		      }
		    },

		    addEvent: function(ele, type, fn) {
		      if (window.addEventListener) {
		        this.addEvent = function(ele, type, fn) {
		          return ele.addEventListener(type, fn, false);
		        };
		      }

		      if (window.attachEvent) {
		        this.addEvent = function(ele, type, fn) {
		          ele.attachEvent('on' + type, fn);
		        };
		      }
		    }
		  };

		  return {
		    slide: function(config) {
		      new Slide(config);
		    }
		  }
		})();
		Animation.slide({
		  target: 'slide',
		  showMarker: true,
		  marker: true,
		  showController: true,
		  setClass: {
		    marker: 'slide-dot',
		    active: 'slide-active',
		    unactive: '',
		    controllerPrev: 'slide-control-prev',
		    controllerNext: 'slide-control-next'
		  }
		});
	</script>
</body>

</html>