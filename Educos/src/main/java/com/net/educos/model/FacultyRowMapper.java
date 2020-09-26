package com.net.educos.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FacultyRowMapper implements RowMapper<Faculty> {

	@Override
	public Faculty mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Faculty fac  = new Faculty();
		fac.setFid(rs.getInt("fid"));
		fac.setFname(rs.getString("fname"));
		fac.setFsubjects(rs.getString("fsubjects"));
		fac.setFaddress(rs.getString("faddress"));
		fac.setFemail(rs.getString("femail"));
		fac.setFgender(rs.getString("fgender"));
		fac.setFcontact(rs.getString("fcontact"));
		fac.setFpassword(rs.getString("fpassword"));
		fac.setRoleid(rs.getInt("roleid"));

		
		
		return fac;
	}
	

}
