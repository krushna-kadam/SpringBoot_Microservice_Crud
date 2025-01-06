package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		System.err.println(student);
		Student s = studentRepository.save(student);
		return s;
	}

	@Override
	public Student getStudent(int id) {
		Student s = studentRepository.findById(id).get();
		return s;
	}

	@Override
	public Student updateStudent(int id,Student student) {
		Student s = studentRepository.save(student);
		return s;
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
		
	}

	
	
}
