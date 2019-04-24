package com.manipal.service;

import java.io.IOException;

public interface LoginService {
	

	public int loginValidate(String userName, String password) throws ClassNotFoundException, IOException;
}