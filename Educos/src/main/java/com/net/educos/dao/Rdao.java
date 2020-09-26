package com.net.educos.dao;

import java.util.List;


import com.net.educos.model.Results;

public interface Rdao
{
	public void addResult(Results result);
	public List<Results> getAllResults();
	public Results findResultById(int id);
	public void updateResult(Results result);
	public void deleteResult(int id);
    
}
