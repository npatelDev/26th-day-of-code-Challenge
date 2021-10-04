package com.StudentRecord.Exception;

public class StudentNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int StudentRollNo;
	public StudentNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(int studentRollNo) {
		super();
		StudentRollNo = studentRollNo;
	}
	@Override
	public String toString() {
		return "StudentNotFoundException [StudentRollNo=" + StudentRollNo + "]";
	}
	

}


