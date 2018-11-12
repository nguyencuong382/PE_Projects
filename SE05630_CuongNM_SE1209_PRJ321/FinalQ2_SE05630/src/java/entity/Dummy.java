/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Dummy {
    private int dummyID;
    private String dummyName;

    public Dummy() {
    }

    public Dummy(int dummyID, String dummyName) {
        this.dummyID = dummyID;
        this.dummyName = dummyName;
    }

    public int getDummyID() {
        return dummyID;
    }

    public void setDummyID(int dummyID) {
        this.dummyID = dummyID;
    }

    public String getDummyName() {
        return dummyName;
    }

    public void setDummyName(String dummyName) {
        this.dummyName = dummyName;
    }
    
    
}
