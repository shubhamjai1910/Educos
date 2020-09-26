package com.net.educos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.net.educos.model.Results;
import com.net.educos.model.ResultRowMapper;


@Transactional
@Repository
public class RdaoImpl implements Rdao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addResult(Results result) {
		// TODO Auto-generated method stub
		/* int stid = Integer.parseInt(result.getSid()); */
		
		
	String query="Insert Into result(sid,name,assignmentrecord,quizrecord,assignmentattempt,quizattempt)values(?,?,?,?,?,?)";	
	jdbcTemplate.update(query,result.getSid(),result.getName(),result.getAssignmentrecord(),result.getQuizrecord(),result.getAssignmentattempt(),result.getQuizattempt());	
	}

	@Override
	public List<Results> getAllResults() {
		// TODO Auto-generated method stub
		
	String query="SELECT *FROM result join student On result.sid = student.sid";
	RowMapper<Results> rowMapper = new ResultRowMapper();
	List<Results> rlist= jdbcTemplate.query(query,rowMapper);
		
		return rlist;
	}
	
	
	@Override
	public Results findResultById(int id) {
		String  query="Select *From faculty WHERE id=?";
		RowMapper<Results>rowMapper=new BeanPropertyRowMapper<Results>(Results.class);
		Results result =jdbcTemplate.queryForObject(query, rowMapper,id);
		return result;
	
	}

	@Override
	public void updateResult(Results result) {
		// TODO Auto-generated method stub
	String query="UPDATE result SET name=?,assignmentrecord=?,quizrecord=?,assignmentattempt=?,quizattempt=? WHERE=id,sid";
	jdbcTemplate.update(query,result.getName(),result.getAssignmentrecord(),result.getQuizrecord(),result.getAssignmentattempt(),result.getQuizattempt(),result.getId(),result.getSid());
	
	}
	@Override
	public void deleteResult(int id) {
		// TODO Auto-generated method stub
		String query="DELETE FROM result WHERE id=?";
		jdbcTemplate.update(query, id);
		
	}
}
	
   
   
   