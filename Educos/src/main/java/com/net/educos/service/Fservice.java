package com.net.educos.service;

import java.util.List;

import com.net.educos.model.Faculty;
import com.net.educos.model.Login;

public interface Fservice {

	public void addFaculty(Faculty faculty);
	public List<Faculty> getAllFaculty();
	public Faculty validateUser(Login login);
	public Faculty findFacultyById(int id);
	public void updateFaculty(Faculty faculty);
	public void deleteFaculty(int id);
}
