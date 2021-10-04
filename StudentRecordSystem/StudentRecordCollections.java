package com.StudentRecord.client;

import java.util.List;


import com.StudenRecord.Service.StudentRecordService;
import com.StudenRecord.Service.StudentRecordServiceImplem;
import com.StudentRecord.dto.StudentRecord;

public class StudentRecordCollections {
	public static void main(String[] args) {
		
		StudentRecordService studList=new StudentRecordServiceImplem();
		studList.addNewStudent(new StudentRecord("Nitesh1",201,"12th B",62));
		studList.addNewStudent(new StudentRecord("Nitesh2",202,"12th C",45));
		studList.addNewStudent(new StudentRecord("Nitesh3",203,"12th A",80));
		studList.addNewStudent(new StudentRecord("Nitesh4",204,"12th A",85));
		studList.addNewStudent(new StudentRecord("Nitesh5",205,"12th A",82));
		
		List<StudentRecord> stu=studList.showAllStudent();
		
		for(StudentRecord stud:stu) {
			System.out.println(stud.getStudentName()+" "+stud.getStudentRollNo()+" "+stud.getStudentClass()+" "+stud.getStudentMarks());
		}
		
		StudentRecord studentList=new StudentRecord("Ram",201,"11th A",43);
		studList.updateStudent(studentList);
		System.out.println("------Updated Student List------");
		stu=studList.showAllStudent();
		for(StudentRecord stu1:stu) {
			System.out.println(stu1.getStudentName()+" "+stu1.getStudentRollNo()+" "+stu1.getStudentClass()+" "+stu1.getStudentMarks());
		}
		
	}
}
