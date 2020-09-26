package com.net.educos.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.net.educos.model.Faculty;
import com.net.educos.model.Login;
import com.net.educos.model.Student;
import com.net.educos.service.FserviceImpl;
import com.net.educos.service.StudentServiceClass;

@Controller
@RequestMapping("/educos")
@SessionAttributes({"name","names"})
public class LoginController {
	
	@Autowired
	private FserviceImpl service;
	
	@Autowired 
	private StudentServiceClass service1;
	
	@RequestMapping(value = {"/login"},method =RequestMethod.GET)
	public ModelAndView showLogin()
	{
		Login login = new Login();
		ModelAndView model = new ModelAndView();
		 model.addObject("logins",login);
		 model.setViewName("login");
		 return model;
	}
	
	@RequestMapping(value = {"/loginval"} ,method = RequestMethod.POST)
	public ModelAndView loginValidate(@ModelAttribute("logins") Login login)
	{
		 
		ModelAndView model = null;
		Faculty fac = service.validateUser(login);
	    Student stu = service1.validateUser(login);
		
		if(null !=fac || null != stu )
		{
			model = new ModelAndView("home");
			model.addObject("names",stu);
			model.addObject("name",fac);
			
		}
		else
		{
			  model = new ModelAndView("login");
			    model.addObject("message", "Username or Password is wrong!!");
		}
		
		
		return model;
	}
	  @GetMapping("/logout")
	   public String logout(SessionStatus status) {
	       
	      status.setComplete();
	      return "redirect:/educos/login";
	   }
}
