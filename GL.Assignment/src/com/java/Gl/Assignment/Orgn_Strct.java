package com.java.Gl.Assignment;

public class Orgn_Strct extends SuperDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDept AdminDepartment=new AdminDept();
		System.out.println("Welcome to "+ AdminDepartment.deptName() );
		System.out.println(AdminDepartment.getTodaysWork());
		System.out.println(AdminDepartment.getWorkDeadline());
		System.out.println(AdminDepartment.isTodayAHoliday());
		System.out.println("");
		
		HrDept HrDepartment=new HrDept();
		System.out.println("Welcome to "+ HrDepartment.deptName());
		System.out.println(HrDepartment.doActivity());
		System.out.println(HrDepartment.getTodaysWork());
		System.out.println(HrDepartment.getWorkDeadline());
		System.out.println(HrDepartment.isTodayAHoliday());
		System.out.println();
		
		TechDept TechDepartment=new TechDept();
		System.out.println("Welcome to "+ TechDepartment.deptName() );
		System.out.println(TechDepartment.getTodaysWork());
		System.out.println(TechDepartment.getStackInformation());
		System.out.println(TechDepartment.getWorkDeadline());
		System.out.println(TechDepartment.isTodayAHoliday());
		
	}

}
