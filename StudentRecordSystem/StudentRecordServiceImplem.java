package com.StudenRecord.Service;

import java.util.List;

import com.StudentRecord.dto.StudentRecord;
import com.StudentRecordDao.StudentRecordDao;
import com.StudentRecordDao.StudentRecordDaoImplem;

public class StudentRecordServiceImplem implements StudentRecordService{
	StudentRecordDao bdao=new StudentRecordDaoImplem();
	@Override
	public void addNewStudent(StudentRecord studentRecord) {
		bdao.addNewStudent(studentRecord);
		
	}

	@Override
	public void removeStudent(StudentRecord studentRecord) {
		bdao.removeStudent(studentRecord);
		
	}

	@Override
	public void updateStudent(StudentRecord studentRecord) {
		bdao.updateStudent(studentRecord);
		
	}

	@Override
	public List<StudentRecord> showAllStudent() {
		
		return bdao.showAllStudent();
	}

}
