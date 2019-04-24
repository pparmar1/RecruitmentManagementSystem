package com.manipal.model;

//import java.util.Date;

public class schedule {

	private String SCHEDULE_ID;
	private String JOB_ID;
	private String DATE;
	private String TIME;
	
	
	public schedule(String SCHEDULE_ID, String JOB_ID, String date2, String TIME) {
		super();
		this.SCHEDULE_ID = SCHEDULE_ID;
		this.JOB_ID =JOB_ID;
		this.DATE = date2;
		this.TIME = TIME;
	}
	public schedule(String JOB_ID, String date2, String TIME) {
		super();
	
		this.JOB_ID =JOB_ID;
		this.DATE = date2;
		this.TIME = TIME;
	}
	
	
	public String getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	
	public String getJOB_ID() {
		return JOB_ID;
	}
	
	public String getDATE1() {
		return  DATE;
	}

	public String getTIME1() {
		return TIME;
	}
	
	
	
	
}
