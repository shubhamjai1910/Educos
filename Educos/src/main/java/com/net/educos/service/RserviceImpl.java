 package com.net.educos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.educos.dao.RdaoImpl;
import com.net.educos.model.Results;

@Service
public class RserviceImpl implements Rservice
{
	@Autowired
	private RdaoImpl dao;

	@Override
	public void addResult(Results result) {
		// TODO Auto-generated method stub
		dao.addResult(result);
		
	}

	@Override
	public List<Results> getAllResults() {
		
        return dao.getAllResults();
	}

	@Override
	public Results findResultById(int id) {
		// TODO Auto-generated method stub
		return dao.findResultById(id);
	}

	@Override
	public void updateResult(Results result) {
		// TODO Auto-generated method stub
		dao.updateResult(result);
	}

	@Override
	public void deleteResult(int id) {
		// TODO Auto-generated method stub
		dao.deleteResult(id);
		
	}

}
