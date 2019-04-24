package com.manipal.model;

public class AddJob {
private String JOB_ID;
private String E_ID;
private String jobTitle;
private String jobDesc;
private String date;
private String domain;
private String experience;
private String location;
private String skillset;
private String status;

                                                                                  

public AddJob(String jOB_ID, String e_ID, String jobTitle, String jobDesc,
		String date, String domain, String experience, String location,
		String skillset,String status) {
	super();
	JOB_ID = jOB_ID;
	E_ID = e_ID;
	this.jobTitle = jobTitle;
	this.jobDesc = jobDesc;
	this.date = date;
	this.domain = domain;
	this.experience = experience;
	this.location = location;
	this.skillset = skillset;
}

public AddJob(String e_ID, String jobTitle, String jobDesc, String date,
		String domain, String experience, String location, String skillset) {
	super();
	this.E_ID = e_ID;
	this.jobTitle = jobTitle;
	this.jobDesc = jobDesc;
	this.date = date;
	this.domain = domain;
	this.experience = experience;
	this.location = location;
	this.skillset = skillset;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public AddJob(String skillset) {
	super();
	this.skillset = skillset;
}

public String getE_ID() {
	return E_ID;
}
public String getJobTitle() {
	return jobTitle;
}
public String getJobDesc() {
	return jobDesc;
}
public String getDate() {
	return date;
}
public String getDomain() {
	return domain;
}
public String getJOB_ID() {
	return JOB_ID;
}

public void setJOB_ID(String jOB_ID) {
	JOB_ID = jOB_ID;
}

public String getExperience() {
	return experience;
}
public String getLocation() {
	return location;
}
public String getSkillset() {
	return skillset;
}


}
