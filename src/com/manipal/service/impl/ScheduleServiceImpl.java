package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import com.manipal.DAO.scheduleDAO;
import com.manipal.DAO.jdbc.implementSchedule;
import com.manipal.model.schedule;
import com.manipal.service.*;

public class ScheduleServiceImpl implements ScheduleService {

	@Override
	public void insertMethods(schedule s) throws ClassNotFoundException, SQLException, IOException {
		scheduleDAO sc= new implementSchedule();
		sc.insertData(s);
		
	}
	public List<schedule> retrieveMethods() throws ClassNotFoundException, SQLException, IOException {
		scheduleDAO sc= new implementSchedule();
		System.out.println("im in service method");
		List<schedule> list = new ArrayList<schedule>();
		
		list=sc.retrieveData();

		return list;
	}
	
		
}