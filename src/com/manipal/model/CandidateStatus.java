package com.manipal.model;

public class CandidateStatus {
private String C_ID;
private String R_ID;
private String I_ID;
private String status;
private String remarks;
public CandidateStatus(String c_ID, String r_ID, String i_ID, String status,
		String remarks) {
	super();
	C_ID = c_ID;
	R_ID = r_ID;
	I_ID = i_ID;
	this.status = status;
	this.remarks = remarks;
}
public String getC_ID() {
	return C_ID;
}
public String getR_ID() {
	return R_ID;
}
public String getI_ID() {
	return I_ID;
}
public String getStatus() {
	return status;
}
public String getRemarks() {
	return remarks;
}


}
