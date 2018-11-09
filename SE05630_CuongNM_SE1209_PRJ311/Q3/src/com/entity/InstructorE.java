/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Admin
 */
public class InstructorE {
	private String id;
	private String name;
	private String address;
	private int status;
	private String groupName;

	public InstructorE(String id, String name, String address, int status, String groupName) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.status = status;
		this.groupName = groupName;
	}
	
	public Object [] toDataRow(){
		String s = (status == 1) ? "Actived" : "Deactived";
		return new Object [] {id, name, address, s, groupName};
	}
	
}
