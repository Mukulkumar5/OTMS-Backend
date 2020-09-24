package com.capgemini.onlinetestmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetestmanagement.entity.Questions;
import com.capgemini.onlinetestmanagement.entity.Test1;
import com.capgemini.onlinetestmanagement.exception.QuestionsException;
import com.capgemini.onlinetestmanagement.service.QuestionsService;
import com.capgemini.onlinetestmanagement.service.Test1Service;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Test1controller {
	
	@Autowired
	private Test1Service testservice;

	//@CrossOrigin
	@PostMapping("/addtest")
	public ResponseEntity<String> addTest(@RequestBody Test1 test, BindingResult br)
	
			throws QuestionsException {
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new QuestionsException(err);
		}
		//try {
			System.err.println("......................HELLO...................");
			System.out.println(test+"Hello");
			testservice.addTest(test);
			return new ResponseEntity<String>("Test added successfully", HttpStatus.OK);

		//} catch (DataIntegrityViolationException ex) {
		//	throw new QuestionsException("ID already exists");
		//}
	}
	
	
//	public ResponseEntity<Theatre> addTheatre(@RequestBody Theatre theatre) throws AllException {
//		
//		theatreService.save(theatre);
//		
//		return new ResponseEntity<>(theatre, HttpStatus.CREATED);
//	}
	
	
	
	
	
	
	@CrossOrigin
	@GetMapping("/viewtest")
	public ResponseEntity<List<Test1>> getQuestionslist() {
		List<Test1> testList = testservice.show();
		return new ResponseEntity<List<Test1>>(testList, HttpStatus.OK);
	}
	@GetMapping("/getQuestions/{testId}")
	public ResponseEntity<List<Questions>> getTest(@PathVariable(name = "testId") Integer testId) {			
		return new ResponseEntity<List<Questions>>(testservice.getTestQuestions(testId), HttpStatus.OK);
	}
	@CrossOrigin
	@DeleteMapping("/deletetest/{testId}")
	public ResponseEntity<String> deletequestions( @PathVariable Integer testId) throws QuestionsException
	{
		try
		{
			testservice.deleteTest(testId);
			return new ResponseEntity<String>("Question is deleted", HttpStatus.OK);
		}
		catch (DataIntegrityViolationException ex) {
			throw new QuestionsException("Question ID  doesnot exists");
		}
	}
	
	@CrossOrigin
	@PutMapping("/updatetest/{testId}")
	public ResponseEntity<String> updatequestions(@Valid @RequestBody Test1 test,@PathVariable Integer testId,BindingResult br ) throws QuestionsException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new QuestionsException(err);
		}
		try {
			testservice.updateTest(test,testId);
			return new ResponseEntity<String>("Questions updated successfully", HttpStatus.OK);

		} catch (DataIntegrityViolationException ex) {
			throw new QuestionsException("Question ID already exists");
		}
	}
	

}
