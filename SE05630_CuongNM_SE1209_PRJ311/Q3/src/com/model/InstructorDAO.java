/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.context.DBContext;
import com.entity.InstructorE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class InstructorDAO {

	public List<InstructorE> selectAll() throws Exception {

		Connection conn = new DBContext().getConnection();
		List<InstructorE> instrs = new ArrayList<>();

		String query = "select\n"
				+ "	I.InstructorID,\n"
				+ "	I.InstructorName,\n"
				+ "	I.Address,\n"
				+ "	I.Status,\n"
				+ "	G.GroupName\n"
				+ "\n"
				+ "from Instructor I\n"
				+ "	inner join Groups G on G.GroupID = I.GroupID";

		ResultSet rs = conn.prepareStatement(query).executeQuery();

		while (rs.next()) {
			String id = rs.getString("InstructorID");
			String name = rs.getString("InstructorName");
			String address = rs.getString("Address");
			int status = rs.getInt("Status");
			String groupName = rs.getString("GroupName");

			instrs.add(new InstructorE(id, name, address, status, groupName));
		}
		rs.close();
		conn.close();
		return instrs;
	}

	public List<InstructorE> searchByGroup(String group, int active) throws Exception {

		Connection conn = new DBContext().getConnection();
		List<InstructorE> instrs = new ArrayList<>();

		String query = "select\n"
				+ "	I.InstructorID,\n"
				+ "	I.InstructorName,\n"
				+ "	I.Address,\n"
				+ "	I.Status,\n"
				+ "	G.GroupName\n"
				+ "\n"
				+ "from Instructor I\n"
				+ "	inner join Groups G on G.GroupID = I.GroupID\n"
				+ "where G.GroupName = '" + group + "' and I.Status = " + active;

		ResultSet rs = conn.prepareStatement(query).executeQuery();

		while (rs.next()) {
			String id = rs.getString("InstructorID");
			String name = rs.getString("InstructorName");
			String address = rs.getString("Address");
			int status = rs.getInt("Status");
			String groupName = rs.getString("GroupName");

			instrs.add(new InstructorE(id, name, address, status, groupName));
		}
		rs.close();
		conn.close();
		return instrs;
	}

	public List<InstructorE> selectAllStatus(int active) throws Exception {

		Connection conn = new DBContext().getConnection();
		List<InstructorE> instrs = new ArrayList<>();

		String query = "select\n"
				+ "	I.InstructorID,\n"
				+ "	I.InstructorName,\n"
				+ "	I.Address,\n"
				+ "	I.Status,\n"
				+ "	G.GroupName\n"
				+ "\n"
				+ "from Instructor I\n"
				+ "	inner join Groups G on G.GroupID = I.GroupID\n"
				+ "where I.Status = " + active;

		ResultSet rs = conn.prepareStatement(query).executeQuery();

		while (rs.next()) {
			String id = rs.getString("InstructorID");
			String name = rs.getString("InstructorName");
			String address = rs.getString("Address");
			int status = rs.getInt("Status");
			String groupName = rs.getString("GroupName");

			instrs.add(new InstructorE(id, name, address, status, groupName));
		}
		rs.close();
		conn.close();
		return instrs;
	}
}
