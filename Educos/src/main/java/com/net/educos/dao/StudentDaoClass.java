package com.net.educos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.net.educos.model.Login;
import com.net.educos.model.Student;
import com.net.educos.model.StudentRowMapper;

@Transactional
@Repository
public class StudentDaoClass implements StudentDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public void addStudent(Student student) {
	String query ="INSERT INTO student(sid,sname,stream,sgender,saddress,scontact,semail,spassword,srepassword,roleid) VALUES(?,?,?,?,?,?,?,?,?,3)";
    jdbctemplate.update(query,student.getSid(),student.getSname(),student.getStream(),student.getSgender(),student.getSaddress(),student.getScontact(),student.getSemail(),student.getSpassword(),student.getSrepassword());		
	}

	@Override
	public List<Student> getStudents() 
	{
		String query= "SELECT * from student";
		;RowMapper<Student> rowMapper = new StudentRowMapper();
		List<Student> stdlist=jdbctemplate.query(query,rowMapper);
	
		return stdlist;
	}

	@Override
	public Student validateUser(Login login) {
		String sql="select *from student where semail='" + login.getUsername() + "'and spassword ='" + login.getPassword() + "'";  
		List<Student>stdList=jdbctemplate.query(sql, new StudentRowMapper());
		   return stdList.size() > 0 ? stdList.get(0) : null;

	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		String sql="SELECT *from Student where sid=? ";
		RowMapper<Student> rowMapper=new BeanPropertyRowMapper<Student>(Student.class);
		Student student=jdbctemplate.queryForObject(sql, rowMapper, id);
		return student;
	
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="UPDATE Student SET sname=?,stream=?,sgender=?,saddress=?,scontact=?,semail=?,spassword=? WHERE=sid";	
		jdbctemplate.update(sql, student.getSname(),student.getStream(),student.getSgender(),student.getSaddress(),student.getScontact(),student.getSemail(),student.getSpassword(),student.getSid());
		
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="DELETE from student where sid=?";
		jdbctemplate.update(sql,id);
		
		
	}

}  
