package com.manipal.model;

public class AssignInterview {
	public AssignInterview(String schedule_id, String interviewer_id,
			String candidate_id) {
		super();
		this.schedule_id = schedule_id;
		this.interviewer_id = interviewer_id;
		this.candidate_id = candidate_id;
	}
	
	
	private String schedule_id;
	private String interviewer_id;
	private String candidate_id;
	
	
	
	public String getSchedule_id() {
		return schedule_id;
	}
	public String getInterviewer_id() {
		return interviewer_id;
	}
	public String getCandidate_id() {
		return candidate_id;
	}
	
	

}
