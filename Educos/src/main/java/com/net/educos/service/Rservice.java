package com.net.educos.service;

import java.util.List;

import com.net.educos.model.Results;

public interface Rservice {

	public void addResult(Results result);
	public List<Results>getAllResults();
	public Results findResultById(int id);
	public void updateResult(Results result);
	public void deleteResult(int id);
	
}
