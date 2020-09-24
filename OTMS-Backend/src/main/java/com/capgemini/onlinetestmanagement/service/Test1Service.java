package com.capgemini.onlinetestmanagement.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.Questionsdao;
import com.capgemini.onlinetestmanagement.dao.Test1dao;
import com.capgemini.onlinetestmanagement.entity.Questions;
import com.capgemini.onlinetestmanagement.entity.Test1;

@Service
public class Test1Service {
	
	@Autowired
	EntityManager em;
	
	@Autowired
	private Test1dao testdao;
//	@Transactional
	public boolean addTest(Test1 test) {
		return testdao.save(test) !=null;
	
	}
	
//	@Transactional
	public void  deleteTest(Integer testId)
	{
		testdao.deleteById(testId);
	}
//	@Transactional
	public List<Test1> show(){
		return testdao.findAll();
	}
//	@Transactional
	public Test1 updateTest(Test1 test,Integer questionsId)
	{
		return testdao.save(test);
	}
     public List<Questions> getTestQuestions(Integer testId) {
		// TODO Auto-generated method stub
		
		
		List<Questions> test = em.createQuery("Select t from Questions t ").getResultList();

		List<Questions> filteredTest = new ArrayList<Questions>();
		for(Questions th :test )
		{
			
			if((th.getTest().getTestId()) == testId)
			{
				filteredTest.add(th);
			}
		}
		return filteredTest;
	}
		
	}
	



