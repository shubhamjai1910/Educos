package com.net.educos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.net.educos.model.Faculty;
import com.net.educos.model.Results;
import com.net.educos.model.Student;
import com.net.educos.service.RserviceImpl;
import com.net.educos.service.StudentServiceClass;

@Controller
@RequestMapping("/educos")

public class ResultController {

	@Autowired
	StudentServiceClass service;
	@Autowired
	RserviceImpl rservice;
	
	
	@RequestMapping(value={"/resultlist"},method = RequestMethod.GET)
	public ModelAndView getAllFaculty(){
    	
       ModelAndView model=new ModelAndView();
       List<Results>list=rservice.getAllResults();
       model.addObject("rlist",list);
       model.setViewName("resultlist");
       return model;
		
	}
	
	
	@ModelAttribute("students")
	public List<Student> Studentlist()
	{
		
		List<Student> studentlist = service.getStudents();  
		
		
		
		return studentlist;
	}
	

	@RequestMapping(value= {"/result"},method = RequestMethod.GET)
	public ModelAndView resultForm()
	{
		Results result = new Results();
		ModelAndView model = new ModelAndView();
		model.addObject("results", result);
		model.setViewName("result");
		return model;
	}
	
	@RequestMapping(value = {"/resultsave"},method = RequestMethod.POST)
	public ModelAndView resultSubmit(@ModelAttribute("results")Results result)
	{
		rservice.addResult(result);
		
		return new ModelAndView("redirect:/educos/home");
		
	}
	
}
