package com.StudenRecord.Service;

import java.util.List;

import com.StudentRecord.dto.StudentRecord;

public interface StudentRecordService {
	public abstract void addNewStudent(StudentRecord studentRecord);
	public abstract void removeStudent(StudentRecord studentRecord);
	public abstract void updateStudent(StudentRecord studentRecord);
	public abstract List<StudentRecord>showAllStudent();
	
}
