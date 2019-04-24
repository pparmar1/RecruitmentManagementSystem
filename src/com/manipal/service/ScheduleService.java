package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface ScheduleService {
	
	public void insertMethods(schedule s) throws ClassNotFoundException, SQLException, IOException;

	public List<schedule> retrieveMethods() throws ClassNotFoundException, SQLException, IOException;
}