package com.net.educos.dao;



import java.util.List;

import com.net.educos.model.Login;
import com.net.educos.model.Student;

public interface StudentDao 
{

public void addStudent(Student student );
public List<Student> getStudents();
public Student validateUser(Login login);
public Student findStudentById(int id);
public void updateStudent(Student student);
public void deleteStudent(int id);


}
