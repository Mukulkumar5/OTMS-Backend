package com.capgemini.onlinetestmanagement.service;

import java.util.List;

import com.capgemini.onlinetestmanagement.entity.Questions;
import com.capgemini.onlinetestmanagement.entity.Test1;


public interface Test1Interface {
	
	boolean addTest(Test1 test);
	void  deleteTest(Integer questionsId);
	List<Test1> show();
	 Test1 viewquestions(Test1 test,Integer questionsId);
	 List<Questions> getTestQuestions(Integer testId);

}
