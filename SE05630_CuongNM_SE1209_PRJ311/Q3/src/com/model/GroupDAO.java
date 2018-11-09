/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.context.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GroupDAO {
	public List<String> selectAllGroupName() throws Exception {
		
		Connection conn = new DBContext().getConnection();
		List<String> grNames = new ArrayList<>();
		
		String query = "select GroupName from Groups";
		
		ResultSet rs = conn.prepareStatement(query).executeQuery();
		
		while (rs.next()) {
			grNames.add(rs.getString("GroupName"));
		}
		rs.close();
		conn.close();
		return grNames;
	}
}
