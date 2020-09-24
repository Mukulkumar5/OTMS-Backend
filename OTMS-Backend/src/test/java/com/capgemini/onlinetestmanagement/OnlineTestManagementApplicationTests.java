package com.capgemini.onlinetestmanagement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.onlinetestmanagement.dao.Questionsdao;
import com.capgemini.onlinetestmanagement.entity.Questions;
import com.capgemini.onlinetestmanagement.entity.Test1;
import com.capgemini.onlinetestmanagement.service.QuestionsService;

//@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineTestManagementApplicationTests {
	
	@Autowired
	private QuestionsService service;
	
	@MockBean
	private Questionsdao dao;
	
//	@Test
//    public void getQuestionslist() {
//    	when(dao.findAll()).thenReturn(Stream.of(new Questions(101,"Java","A","B","C"
//    			,"D", new Test1(1),1,3,1,9)).collect(Collectors.toList()));
//    	assertEquals(1,service.show().size());
//    	
//    }
	
//	@Test
//	public void addQuestionsTest() {
//		Questions question  = (new Questions(107,"Java","A","B","C"
//    			,"D", new Test1(1),1,3,1,9));
//		when(dao.save(question)).thenReturn(question);
//		assertEquals(question, service.addQuestions(question));
//	}
	@Test
	void contextLoads() {
	}

}
