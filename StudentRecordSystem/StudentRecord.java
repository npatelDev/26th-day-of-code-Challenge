package com.StudentRecord.dto;

public class StudentRecord {
	//POJO Class
	private String StudentName;
	private int StudentRollNo;
	private String StudentClass;
	private int StudentMarks;
	public StudentRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRecord(String studentName, int studentRollNo, String studentClass, int studentMarks) {
		super();
		StudentName = studentName;
		StudentRollNo = studentRollNo;
		StudentClass = studentClass;
		StudentMarks = studentMarks;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentRollNo() {
		return StudentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	public String getStudentClass() {
		return StudentClass;
	}
	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}
	public int getStudentMarks() {
		return StudentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		StudentMarks = studentMarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudentRollNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentRecord other = (StudentRecord) obj;
		if (StudentRollNo != other.StudentRollNo)
			return false;
		return true;
	}
	

	
}