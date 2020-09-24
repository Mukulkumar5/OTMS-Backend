package com.capgemini.onlinetestmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Test")
public class Test1 {

@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Id")
@NotNull(message="Username not be nulled")
@Positive
private Integer testId;

@Override
public String toString() {
	return "Test1 [testId=" + testId + ", testTitle=" + testTitle + ", testDuration=" + testDuration
			+ ", testquestions=" + testquestions + ", testTotalMarks=" + testTotalMarks +", startTime=" + startTime + ", endTime=" + endTime + "]";
}

@Column(name="Title")
private String testTitle;

@Column(name="Duration")
private String testDuration;



//@OneToMany
//@JoinColumn(name="Question", nullable=false)
//private Set<Questions> testquestions;// collection mapping using many too one

@OneToMany(mappedBy = "test", fetch = FetchType.EAGER,
cascade = CascadeType.ALL)
private Set<Questions> testquestions;




@Column(name="TotalMarks")
private Integer testTotalMarks;

//@Column(name="MarksScored")
//private Integer testMarksScored;



@Column(name="StartTime")
@Temporal(TemporalType.TIME)
private Date startTime;
//@Column(name="time_reserved_start")
//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm:ss")
//@Temporal(TemporalType.TIME)
//@NotNull
//private Date testDuration;

@Column(name="Endtime")
@Temporal(TemporalType.TIME)
@Future
private Date endTime;

public Integer getTestId() {
	return testId;
}

public void setTestId(Integer testId) {
	this.testId = testId;
}

public String getTestTitle() {
	return testTitle;
}

public void setTestTitle(String testTitle) {
	this.testTitle = testTitle;
}

public String getTestDuration() {
	return testDuration;
}

public void setTestDuration(String testDuration) {
	this.testDuration = testDuration;
}

//public Set<Questions> getTestquestions() {
//	return testquestions;
//}
//
//public void setTestquestions(Set<Questions> testquestions) {
//	this.testquestions = testquestions;
//}

public Integer getTestTotalMarks() {
	return testTotalMarks;
}

public void setTestTotalMarks(Integer testTotalMarks) {
	this.testTotalMarks = testTotalMarks;
}






public Date getStartTime() {
	return startTime;
}

public void setStartTime(Date startTime) {
	this.startTime = startTime;
}

public Date getEndTime() {
	return endTime;
}

public void setEndTime(Date endTime) {
	this.endTime = endTime;
}

public Test1(@NotNull(message = "Username not be nulled") @Positive Integer testId, String testTitle, String testDuration,
	 Integer testTotalMarks, Questions currentQuestion,
		Date startTime, @Future Date endTime) {
	super();
	this.testId = testId;
	this.testTitle = testTitle;
	this.testDuration = testDuration;
//	this.testquestions = testquestions;
	this.testTotalMarks = testTotalMarks;
	
	this.startTime = startTime;
	this.endTime = endTime;
}

public Test1() {
	super();
	// TODO Auto-generated constructor stub
}

public Test1(Integer testId) {
	// TODO Auto-generated constructor stub
	this.testId  = testId;
}



}
