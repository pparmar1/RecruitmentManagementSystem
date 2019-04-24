package com.manipal.model;

import java.util.Date;

public class Interviewer {
	
	
	

	private String Interviewer_id;
	private String Employee_id;
	private String Job_id;
	private String Interviewer_Status;
	
	
	
	private String schedule_id;
	private String dateString;
	private String time;
	private String job_title;
	
	
	
	
	public Interviewer(String interviewer_id, String employee_id,
			String job_id, String interviewer_Status) {
		super();
		Interviewer_id = interviewer_id;
		Employee_id = employee_id;
		Job_id = job_id;
		Interviewer_Status = interviewer_Status;
	}
	
	public Interviewer(String interviewer_id, String employee_id, String job_id) {
		super();
		Interviewer_id = interviewer_id;
		Employee_id = employee_id;
		Job_id = job_id;
	}

	public Interviewer(String schedule_id, String interviewer_Id2,
			String dateString, String time,
			String job_title) {
	
		this.schedule_id=schedule_id;
		this.Interviewer_id=interviewer_Id2;
		this.dateString=dateString;
		this.time=time;
		this.job_title=job_title;
	}

	public String getInterviewer_id() {
		return Interviewer_id;
	}

	public void setInterviewer_id(String interviewer_id) {
		Interviewer_id = interviewer_id;
	}

	public String getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(String employee_id) {
		Employee_id = employee_id;
	}

	public String getJob_id() {
		return Job_id;
	}

	public void setJob_id(String job_id) {
		Job_id = job_id;
	}

	public String getInterviewer_Status() {
		return Interviewer_Status;
	}

	public void setInterviewer_Status(String interviewer_Status) {
		Interviewer_Status = interviewer_Status;
	}

	public String getSchedule_id() {
		return schedule_id;
	}

	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}


}
