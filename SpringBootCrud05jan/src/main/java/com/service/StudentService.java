package com.service;

import com.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public Student updateStudent(int id,Student student);
	
	public void deleteStudent(int id);
}
