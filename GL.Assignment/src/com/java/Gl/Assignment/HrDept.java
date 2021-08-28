package com.java.Gl.Assignment;

public class HrDept extends SuperDept {
	
	String doActivity;
	
	String deptName() {
		this.departmentName="Hr Department";
		return departmentName;
		
	}
	
	String getTodaysWork() {
		this.getTodaysWork="Fill today's worksheet and mark your attendance";
		return getTodaysWork;
		
	}
	
	String getWorkDeadline() {
		this.getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
		
	}
	
	String doActivity() {
		this.doActivity="Team Lunch";
		return doActivity;
		
	}
	
	

	
}


