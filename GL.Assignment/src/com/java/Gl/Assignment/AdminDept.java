package com.java.Gl.Assignment;

public class AdminDept extends SuperDept {
	String deptName() {
		this.departmentName="Admin Department";
		return departmentName;
		
	}
	
	String getTodaysWork() {
		this.getTodaysWork="Complete Your Document Submission";
		return getTodaysWork;
		
	}
	
	String getWorkDeadline() {
		this.getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
		
	}

	
}
