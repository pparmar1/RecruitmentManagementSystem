package com.manipal.model;

public class referral {

	private String R_ID;
	private String E_ID;
	private String JOB_ID;
	private String name;
	private Long contact;
	private String email;
	//public String resume;
	private String status;
	

	public referral(String R_ID, String E_ID, String JOB_ID, String name,
			Long contact, String email,String status) {
		super();
		this.R_ID = R_ID;
		this.E_ID = E_ID;
		this.JOB_ID = JOB_ID;
		this.name = name;
		this.contact = contact;
		this.email = email;
		
		this.status = status;
	}
	public referral(String emp_id, String job_id, String name,
			Long contact, String email, String status) {
		// TODO Auto-generatethis.
		this.E_ID = emp_id;
		this.JOB_ID = job_id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		
		this.status = status;
	}
	public String getR_ID() {
		return R_ID;
	}
	
	public String getE_ID() {
		return E_ID;
	}
	
	public String getJOB_ID() {
		return JOB_ID;
	}
	
	public String getName() {
		return name;
	}
	
	public Long getContact() {
		return contact;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getStatus() {
		return status;
	}
	
	
}
