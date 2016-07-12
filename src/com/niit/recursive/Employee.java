package com.niit.recursive;

import com.niit.recursive.Department;

public class Employee {

	private int ID;

	private String name;

	private Employee manager;

	private Department dept;

	public Employee(int iD, String name) {
		super();
		this.ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public static void main(String[] args) {

		Employee manager = new Employee(01, "TOM");
		Employee clerk = new Employee(02, "STEVE");
		clerk.setManager(manager);
		Department off = new Department("50", "office");
		clerk.setDept(off);

		display(clerk);
	}

	public static void display(Employee clerk) {
		// TODO Auto-generated method stub
		System.out.println(clerk.getID());
		System.out.println(clerk.getName());	
		System.out.println(clerk.getManager().getID());
		System.out.println(clerk.getManager().getName());
		System.out.println(clerk.getDept().getId());
		System.out.println(clerk.getDept().getName());
		
	}
	

}
