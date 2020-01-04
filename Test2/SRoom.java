package com.test;

public class SRoom {
	
	String name;
	String loaction;
	int model;
	String cname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "SRoom [name=" + name + ", loaction=" + loaction + ", model=" + model + ", cname=" + cname + "]";
	}
	public SRoom(String name, String loaction, int model, String cname) {
		super();
		this.name = name;
		this.loaction = loaction;
		this.model = model;
		this.cname = cname;
	}
	

}
