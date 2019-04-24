package com.manipal.model;



public class details {
	public String empId;
	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String username;
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getProof_type() {
		return Proof_type;
	}


	public void setProof_type(String proof_type) {
		Proof_type = proof_type;
	}


	public String getProof() {
		return Proof;
	}


	public void setProof(String proof) {
		Proof = proof;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String password;
	String name;
	String gender;
	String dob;
	long contact;
	String address;
	String email;
	String city;
	String state;
	String qualification;
	int score;
	String Proof_type;
	String Proof;
	int experience;
	String designation;
	private int id;
		
	
	public details(int id, String username, String password, String name,
			String gender, String dob, long contact, String address,
			String email, String city, String state, String qualifications,
			int score, String proof_Type, String proof, int experience, String designation) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.city=city;
		this.state=state;
		this.qualification=qualifications;
		this.score = score;
		this.Proof_type = proof_Type;
		this.Proof = proof;
		this.experience = experience;
		this.designation = designation;
		
	}


	public details(String username, String name, String gender, String dob,
			String dateString, long contact, String address, String email, String city,
			String state, String qualification, int score, String proof_type,
			String proof, int experience, String designation) {
		super();
		this.username = username;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.city = city;
		this.state = state;
		this.qualification = qualification;
		this.score = score;
		Proof_type = proof_type;
		Proof = proof;
		this.experience = experience;
		this.designation = designation;
	}


	public details(String username2, String name2, String gender2,
			String dateString, long contact2, String address2, String email2,
			String city2, String state2, String qualifications, int score2,
			String proof_Type2, String proof2, int experience2,
			String designation2) {
		// TODO Auto-generated constructor stub
	}
	
		
}
