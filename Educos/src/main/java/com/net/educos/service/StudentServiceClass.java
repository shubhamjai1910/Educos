package com.net.educos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.educos.dao.StudentDaoClass;
import com.net.educos.model.Login;
import com.net.educos.model.Student;

@Service
public class StudentServiceClass implements StudentService {

	
	@Autowired
	private StudentDaoClass dao;
	
	
	@Override
	public void addStudent(Student student) 
	{
		// TODO Auto-generated method stub
		dao.addStudent(student);
		
	}
	

	@Override
	public List<Student> getStudents() 
	{
		// TODO Auto-generated method stub
		return dao.getStudents();
		
	}


	@Override
	public Student validateUser(Login login) {
		// TODO Auto-generated method stub
		return dao.validateUser(login);
	}


	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.findStudentById(id);
	}


	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		dao.updateStudent(student);
		
	}


	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		dao.deleteStudent(id);
		
	}




}
