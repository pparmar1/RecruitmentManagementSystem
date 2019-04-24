package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.referralDAO;
import com.manipal.DAO.jdbc.implementReferral;
import com.manipal.model.referral;
import com.manipal.service.ReferralService;


public class ReferralServiceImpl implements ReferralService {

	public void insertMethods(referral r) throws ClassNotFoundException, SQLException, IOException {
		referralDAO ref= new implementReferral();
		ref.insertData(r);
		
	}
	public List<referral> retrieveMethods() throws ClassNotFoundException, SQLException, IOException {
		referralDAO ref1= new implementReferral();
		System.out.println("im in service method");
		List<referral> list = new ArrayList<referral>();
		
		list=ref1.retrieveData();

		return list;
	}
	
		

}
