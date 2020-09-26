package com.net.educos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.educos.dao.FdaoImpl;
import com.net.educos.model.Faculty;
import com.net.educos.model.Login;

@Service
public class FserviceImpl implements Fservice  {
	
	@Autowired
	private FdaoImpl dao;

	@Override
	public void addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		
		dao.addFaculty(faculty);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return dao.getAllFaculty();
	}

	@Override
	public Faculty validateUser(Login login) {
		// TODO Auto-generated method stub
		return dao.validateUser(login);
	}

	@Override
	public Faculty findFacultyById(int id) {
		return dao.findFacultyById(id);
	}

	@Override
	public void updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		dao.updateFaculty(faculty);
		
	}

	@Override
	public void deleteFaculty(int id) {
		// TODO Auto-generated method stub
		dao.deleteFaculty(id);
	}

}
