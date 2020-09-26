package com.net.educos.dao;

import java.util.List;

import com.net.educos.model.Faculty;
import com.net.educos.model.Login;

public interface Fdao {

	public void addFaculty(Faculty faculty);
	public List<Faculty> getAllFaculty();
	public Faculty validateUser(Login login);
	public Faculty findFacultyById(int id);
	public void updateFaculty(Faculty faculty);
	public void deleteFaculty(int id);
}
