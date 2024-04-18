package com.pojo;

public class Student {
	private int r_no;
	private String name;
	private String branch;
	private String adress;
	
public Student()
{

}
	
public Student(int r_no, String name, String branch, String adress) {
	super();
	this.r_no = r_no;
	this.name = name;
	this.branch = branch;
	this.adress = adress;
}

public int getR_no() {
	return r_no;
}

public void setR_no(int r_no) {
	this.r_no = r_no;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

	@Override
	public String toString() {
		return "Student [r_no=" + r_no + ", name=" + name + ", branch=" + branch + ", adress=" + adress + "]";
	}


	
	




	

}
