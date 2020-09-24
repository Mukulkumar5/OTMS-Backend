package com.capgemini.onlinetestmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Questions_table")
public class Questions {
	@Id
	@Column(name = "QuestionsId")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questions_seq")
	//@SequenceGenerator(sequenceName = "questions_seq", initialValue = 100, allocationSize = 1, name = "questions_seq")
	private Integer questionsId;

	private String questionsTitle;

	private String questionsOptionA;

	private String questionsOptionB;

	private String questionsOptionC;

	private String questionsOptionD;
	 private Integer questionNo;
	      /**
	 * @return the test
	 */
	public Test1 getTest() {
		return test;
	}



	/**
	 * @param test the test to set
	 */
	public void setTest(Test1 test) {
		this.test = test;
	}

//		@ManyToOne
//	    @JoinColumn(name="testId", nullable=false)
//	    private Test1 test;
	
	
		 @ManyToOne(fetch = FetchType.EAGER, optional = false)
		    @JoinColumn(name = "testId", nullable = false)
		    private Test1 test;
	//private Integer testId;

	@Override
	public String toString() {
		return "Questions [questionsId=" + questionsId + ", questionsTitle=" + questionsTitle + ", questionsOptionA="
				+ questionsOptionA + ", questionsOptionB=" + questionsOptionB + ", questionsOptionC=" + questionsOptionC
				+ ", questionsOptionD=" + questionsOptionD + ", test=" + test + ", questionsAnswer=" + questionsAnswer
				+ ", questionsMarks=" + questionsMarks + ", questionNo=" + questionNo + "]";
	}

	private String questionsAnswer;

	private Integer questionsMarks;

	/**
	 * @return the questionNo
	 */
	public Integer getQuestionNo() {
		return questionNo;
	}



	/**
	 * @param questionNo the questionNo to set
	 */
	public void setQuestionNo(Integer questionNo) {
		this.questionNo = questionNo;
	}



	//private Integer marksScored;

	public Questions() {
		// System.out.println(QuestionsTitle +""+QuestionsOptionA);
		super();
	}

	/**
	 * @param questionsId
	 * @param questionsTitle
	 * @param questionsOptionA
	 * @param questionsOptionB
	 * @param questionsOptionC
	 * @param questionsOptionD
	 * @param test
	 * @param questionsAnswer
	 * @param questionsMarks
	 * @param questionNo
	 */
	public Questions(Integer questionsId, String questionsTitle, String questionsOptionA, String questionsOptionB,
			String questionsOptionC, String questionsOptionD, Test1 test, String questionsAnswer,
			Integer questionsMarks, Integer questionNo) {
		super();
		this.questionsId = questionsId;
		this.questionsTitle = questionsTitle;
		this.questionsOptionA = questionsOptionA;
		this.questionsOptionB = questionsOptionB;
		this.questionsOptionC = questionsOptionC;
		this.questionsOptionD = questionsOptionD;
		this.test = test;
		this.questionsAnswer = questionsAnswer;
		this.questionsMarks = questionsMarks;
		this.questionNo = questionNo;
	}



	/**
	 * @param questionsId
	 * @param questionsTitle
	 * @param questionsOptionA
	 * @param questionsOptionB
	 * @param questionsOptionC
	 * @param questionsOptionD
	 * @param questionsAnswer
	 * @param questionsMarks
	 * @param chosenAnswer
	 * @param marksScored
	 */
	
	




	/**
	 * @return the questionsIds
	 */
	public Integer getQuestionsId() {
		return questionsId;
	}

	/**
 * @param questionsId
 * @param questionsTitle
 * @param questionsOptionA
 * @param questionsOptionB
 * @param questionsOptionC
 * @param questionsOptionD
 * @param test
 * @param questionsAnswer
 * @param questionsMarks
 * @param chosenAnswer
 * @param marksScored
 */
	




	/**
	 * @param questionsId the questionsId to set
	 */
	public void setQuestionsId(Integer questionsId) {
		this.questionsId = questionsId;
	}

	/**
	 * @return the questionsTitle
	 */
	public String getQuestionsTitle() {
		return questionsTitle;
	}

	/**
	 * @param questionsTitle the questionsTitle to set
	 */
	public void setQuestionsTitle(String questionsTitle) {
		this.questionsTitle = questionsTitle;
	}

	/**
	 * @return the questionsOptionA
	 */
	public String getQuestionsOptionA() {
		return questionsOptionA;
	}

	/**
	 * @param questionsOptionA the questionsOptionA to set
	 */
	public void setQuestionsOptionA(String questionsOptionA) {
		this.questionsOptionA = questionsOptionA;
	}

	/**
	 * @return the questionsOptionB
	 */
	public String getQuestionsOptionB() {
		return questionsOptionB;
	}

	/**
	 * @param questionsOptionB the questionsOptionB to set
	 */
	public void setQuestionsOptionB(String questionsOptionB) {
		this.questionsOptionB = questionsOptionB;
	}

	/**
	 * @return the questionsOptionC
	 */
	public String getQuestionsOptionC() {
		return questionsOptionC;
	}

	/**
	 * @param questionsOptionC the questionsOptionC to set
	 */
	public void setQuestionsOptionC(String questionsOptionC) {
		this.questionsOptionC = questionsOptionC;
	}

	/**
	 * @return the questionsOptionD
	 */
	public String getQuestionsOptionD() {
		return questionsOptionD;
	}

	/**
	 * @param questionsOptionD the questionsOptionD to set
	 */
	public void setQuestionsOptionD(String questionsOptionD) {
		this.questionsOptionD = questionsOptionD;
	}

	/**
	 * @return the questionsAnswer
	 */
	public String getQuestionsAnswer() {
		return questionsAnswer;
	}

	/**
	 * @param questionsAnswer the questionsAnswer to set
	 */
	public void setQuestionsAnswer(String questionsAnswer) {
		this.questionsAnswer = questionsAnswer;
	}

	/**
	 * @return the questionsMarks
	 */
	public Integer getQuestionsMarks() {
		return questionsMarks;
	}

	/**
	 * @param questionsMarks the questionsMarks to set
	 */
	public void setQuestionsMarks(Integer questionsMarks) {
		this.questionsMarks = questionsMarks;
	}





	



}