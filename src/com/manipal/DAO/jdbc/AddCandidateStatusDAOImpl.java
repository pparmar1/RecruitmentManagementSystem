package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.AddCandidateStatusDAO;
import com.manipal.model.AddJob;
import com.manipal.model.CandidateStatus;

public class AddCandidateStatusDAOImpl implements AddCandidateStatusDAO{

	@Override
	public void insertCanStatus(CandidateStatus cs) throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getDBConnection();
		PreparedStatement pst = con.prepareStatement("insert into candidate_status values(?,?,?,?,?)");
		
		pst.setString(1, cs.getC_ID());
		if(cs.getC_ID()==null){
			System.out.println("null");
		}
		pst.setString(2, cs.getI_ID());
		pst.setString(3, cs.getStatus());
		pst.setString(4, cs.getRemarks());
		pst.setString(5, cs.getR_ID());
		int i = pst.executeUpdate();
		 if(i!=0){
		        System.out.println("Record has been inserted");
		      }
		      else{
		        System.out.println("failed to insert the data");
		      }
	}

	@Override
	public List<CandidateStatus> displayCandidateStatusList() throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getDBConnection();
		List<AddJob> list = new ArrayList();
		String sql = "select * from candidate_status";
		Connection con1 = DataBaseConnection.getDBConnection();
		Statement st = con1.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			
			String E_ID = rs.getString(2);
			String jobDesc = rs.getString(3);
			String jobTitle = rs.getString(4);
		return null;
	}
		return null;

	
}
}