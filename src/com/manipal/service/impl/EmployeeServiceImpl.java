package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.CandidateDetailsDAO;
import com.manipal.DAO.detailsDAO;
import com.manipal.DAO.jdbc.implementDetails;
import com.manipal.DAO.jdbc.ImplementCandidateDetails;
import com.manipal.model.details;
import com.manipal.service.employeeService;

public class EmployeeServiceImpl implements employeeService{

	@Override
	public void insertEmployee(details d) throws ClassNotFoundException, SQLException, IOException {
		detailsDAO dservice = null;
		try {
			dservice = new implementDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dservice.insertData(d);
	}

	
		public List<details> retrieveEmployeeData()
				throws ClassNotFoundException, SQLException, IOException {
			
			detailsDAO dservice = new implementDetails();
			List<details> list;
			try {
				list = new ArrayList<details>();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list = dservice.retrieveData();
			return list;
			
		}
	//	



		public List<details> retrieveParticularEmployeeData(String username) throws ClassNotFoundException,
		SQLException, IOException{
			detailsDAO dservice = new implementDetails();

			return dservice.retrieveParticularEmployeeData(username);
			
	}


		@Override
		public details retriveEmployeeUserData(String employeeID)
				throws ClassNotFoundException, SQLException, IOException {
			
			detailsDAO edao = new implementDetails();
			 return edao.retrieveEmployeeByID(employeeID);
		
			
		}


		@Override
		public String updateEmployeeData(String employeeId, String name) throws IOException {
			
			detailsDAO edao = new implementDetails();
			return edao.updateEmployeeData(employeeId, name);
			//return null;
		}
	
}
