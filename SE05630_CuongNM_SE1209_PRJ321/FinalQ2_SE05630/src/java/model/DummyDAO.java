/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import context.DBContext;
import entity.Dummy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DummyDAO {

    public List<Dummy> list(String query) throws Exception {
        List<Dummy> dummies = new ArrayList<>();
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn
                .prepareStatement(query);
        ResultSet resultSet = ps.executeQuery();

        while (resultSet.next()) {
            Dummy d = new Dummy();
            d.setDummyID(resultSet.getInt("DummyID"));
            d.setDummyName(resultSet.getString("DummyName"));
            dummies.add(d);
        }

        resultSet.close();
        conn.close();
        return dummies;
    }

    public List<Dummy> getAllDummies() throws Exception {
        String query = "select * from Dummy";
        return list(query);
    }

    public Dummy getDummyById(int id) throws Exception {
        String query = "select * from Dummy where DummyID = " + id;
        return list(query).get(0);
    }

    public boolean updateDummy(int oldDummyId, String oldDummyName, int newDummyId, String newDummyName) throws Exception {
        String query = "UPDATE Dummy\n"
                + "   SET DummyID = "+newDummyId+"\n"
                + "      ,DummyName = '"+newDummyName+"'\n"
                + " WHERE DummyID = "+oldDummyId+" and DummyName = '"+oldDummyName+"'";

        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn
                .prepareStatement(query);

        int n = ps.executeUpdate();
        ps.close();
        conn.close();

        return n > 0;
    }
}
