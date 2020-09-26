package com.net.educos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.net.educos.model.Student;
import com.net.educos.service.StudentServiceClass;



@Controller
@RequestMapping("/educos")
@SessionAttributes("names")
public class Scontroller 
{
	@Autowired
	private StudentServiceClass service;
	
    @RequestMapping(value= {"/slist"},method = RequestMethod.GET)
    public ModelAndView getStudents() {
    	

       ModelAndView model=new ModelAndView();
       List<Student>list=service.getStudents();
       model.addObject("studentlist", list);
	   model.setViewName("studentlist");
	   return model;
       		
}
	
	
	@RequestMapping(value= {"/studentadd"}, method = RequestMethod.GET)
	public ModelAndView addstudent() {
	
		Student std=new Student();
		ModelAndView model=new ModelAndView();
		model.addObject("Students",std);
		model.setViewName("student");
    	return model;
			
	}
	
	@RequestMapping(value="/updates/{id}",method=RequestMethod.GET)
	public ModelAndView editStudent(@PathVariable int id){
	ModelAndView  model=new ModelAndView();
	Student std =service.findStudentById(id);
    model.addObject("Students", std);
	model.setViewName("student");
	return model;
	}
	
	
	@RequestMapping(value="/deletes/{id}",method = RequestMethod.GET)
	
	public ModelAndView deleteStudent(@PathVariable ("id") int id) {
	service.deleteStudent(id);
	return  new ModelAndView("redirect:/educos/slist");
	
	
	}	
	
	
	
	@RequestMapping(value= {"/savestudent"},method = RequestMethod.POST)
	public ModelAndView save (@ModelAttribute("Students") Student std) 
	{
		service.addStudent(std);
		return new ModelAndView("redirect:/educos/home");
	}
	
}
