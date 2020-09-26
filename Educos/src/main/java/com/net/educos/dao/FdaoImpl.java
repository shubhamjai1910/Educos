package com.net.educos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.net.educos.model.Faculty;
import com.net.educos.model.FacultyRowMapper;
import com.net.educos.model.Login;

@Transactional
@Repository
public class FdaoImpl implements Fdao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
	
		String qry = "INSERT Into faculty(fid,fname,fsubjects,faddress,femail,fgender,fcontact,fpassword,roleid) values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(qry,faculty.getFid(),faculty.getFname(),faculty.getFsubjects(),faculty.getFaddress(),faculty.getFemail(),faculty.getFgender(),faculty.getFcontact(),faculty.getFpassword(),2);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		
		String qry = "SELECT * FROM faculty";
		RowMapper<Faculty> rowMapper = new FacultyRowMapper();
		List<Faculty> faclist = jdbcTemplate.query(qry,rowMapper);
		// TODO Auto-generated method stub
		return faclist;
	}

	@Override
	public Faculty validateUser(Login login) {
		 String sql = "select * from faculty where femail='" + login.getUsername() + "' and fpassword='" + login.getPassword()
		    + "'";
		    List<Faculty> faclist = jdbcTemplate.query(sql, new FacultyRowMapper());
		    return faclist.size() > 0 ? faclist.get(0) : null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Faculty findFacultyById(int id) {
		String  query="Select *From faculty WHERE fid=?";
		RowMapper<Faculty>rowMapper=new BeanPropertyRowMapper<Faculty>(Faculty.class);
		Faculty faculty=jdbcTemplate.queryForObject(query, rowMapper,id);
		return faculty;
	}

	@Override
	public void updateFaculty(Faculty faculty) {
		String query="UPDATE faculty SET fname=?,fsubjects=?,faddress=?,femail=?,fgender=?,fcontact=?,fpassword=? WHERE=fid";	
		jdbcTemplate.update(query,faculty.getFname(),faculty.getFsubjects(),faculty.getFaddress(),faculty.getFemail(),faculty.getFgender(),faculty.getFcontact(),faculty.getFpassword(),faculty.getFid());

		
	}

	@Override
	public void deleteFaculty(int id) {
		String query="DELETE FROM faculty WHERE fid=?";
		jdbcTemplate.update(query,id);	

		
	}
	
	

}
