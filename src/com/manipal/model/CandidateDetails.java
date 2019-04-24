package com.manipal.model;

public class CandidateDetails {
	private String CID;
	private String username;
	private String password;
	private String name;
	private String gender;
	private String dob;
	private long contact_no;
	private String email;
	private String address;
	private String city;
	private String state;
	private String qualification;
	private int score;
	private String proof_type;
	private String proof;
	private int experience;
	private String JOB_ID;
	private String status;
	public CandidateDetails(String cID, String username, String password,
			String name, String gender, String dob, long contact_no,
			String email, String address, String city, String state,
			String qualification, int score, String proof_type, String proof,
			int experience, String jOB_ID, String status) {
		super();
		CID = cID;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contact_no = contact_no;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.qualification = qualification;
		this.score = score;
		this.proof_type = proof_type;
		this.proof = proof;
		this.experience = experience;
		JOB_ID = jOB_ID;
		this.status = status;
	}
	

	public CandidateDetails(String username, String password,
			String name, String gender, String dob, long contact_no,
			String email, String address, String city, String state,
			String qualification, int score, String proof_type, String proof,
			int experience, String jOB_ID, String status) {
		super();
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contact_no = contact_no;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.qualification = qualification;
		this.score = score;
		this.proof_type = proof_type;
		this.proof = proof;
		this.experience = experience;
		JOB_ID = jOB_ID;
		this.status = status;
	}


	public CandidateDetails(String cID2, String name2, long contact,
			String email2) {
		this.CID=cID2;
		this.name=name2;
		this.contact_no=contact;
		this.email=email2;
	}


	public String getCID() {
		return CID;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public long getContact_no() {
		return contact_no;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getQualification() {
		return qualification;
	}
	public int getScore() {
		return score;
	}
	public String getProof_type() {
		return proof_type;
	}
	public String getProof() {
		return proof;
	}
	public int getExperience() {
		return experience;
	}
	public String getJOB_ID() {
		return JOB_ID;
	}
	public String getStatus() {
		return status;
	}
	
	
}
