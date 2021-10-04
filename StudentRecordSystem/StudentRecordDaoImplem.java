package com.StudentRecordDao;


import java.util.LinkedList;
import java.util.List;

import com.StudentRecord.Exception.StudentNotFoundException;
import com.StudentRecord.dto.StudentRecord;

public class StudentRecordDaoImplem implements StudentRecordDao {

	List<StudentRecord> studentList=new LinkedList<>();
	
	@Override
	public void addNewStudent(StudentRecord studentRecord) {
		studentList.add(studentRecord);
		
	}

	@Override
	public void removeStudent(StudentRecord studentRecord) {
		if(!studentList.contains(studentRecord)) {
			try {
			throw new StudentNotFoundException(studentRecord.getStudentRollNo());
			}catch(StudentNotFoundException e){
				e.printStackTrace();
			}
		}
		studentList.remove(studentRecord);
		
	}

	@Override
	public void updateStudent(StudentRecord studentRecord) {
		if(!studentList.contains(studentRecord)) {
			try {
			throw new StudentNotFoundException(studentRecord.getStudentRollNo());
			}catch(StudentNotFoundException e){
				e.printStackTrace();
			}
		}
		int index= studentList.indexOf(studentRecord);
		studentList.set(index, studentRecord);
		
	}

	@Override
	public List<StudentRecord> showAllStudent() {
		return studentList;
		
		
	}

}
