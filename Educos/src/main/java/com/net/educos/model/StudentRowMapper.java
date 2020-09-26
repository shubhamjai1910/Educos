package com.net.educos.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student std=new Student();
		std.setSid(rs.getInt("sid"));
		std.setSname(rs.getString("sname"));
		std.setStream(rs.getString("stream"));
		std.setSgender(rs.getString("sgender"));
		std.setSaddress(rs.getString("saddress"));
		std.setScontact(rs.getString("scontact"));
		std.setSemail(rs.getString("semail"));
		std.setSpassword(rs.getString("spassword"));
		std.setSrepassword(rs.getString("srepassword"));
		
		

		return std;
	}
	
	
	
	

}
