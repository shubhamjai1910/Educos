package com.net.educos.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ResultRowMapper implements RowMapper<Results>
{

	@Override
	public Results mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Results res=new Results();
		
		res.setId(rs.getInt("id"));
		res.setSid(rs.getInt("sid"));
		res.setName(rs.getString("name"));
		res.setAssignmentrecord(rs.getString("assignmentrecord"));
		res.setQuizrecord(rs.getString("quizrecord"));
		res.setAssignmentattempt(rs.getString("assignmentattempt"));
		res.setQuizattempt(rs.getString("quizattempt"));
		res.setSgender(rs.getString("sgender"));
		res.setSaddress(rs.getString("saddress"));
		res.setStream(rs.getString("stream"));
		res.setScontact(rs.getString("scontact"));
		res.setSemail(rs.getString("semail"));
		return res;
	}

}
