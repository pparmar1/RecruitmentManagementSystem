package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.referral;


public interface ReferralService {

	public void insertMethods(referral r) throws ClassNotFoundException, SQLException, IOException;

	public List<referral> retrieveMethods() throws ClassNotFoundException, SQLException, IOException;
}
