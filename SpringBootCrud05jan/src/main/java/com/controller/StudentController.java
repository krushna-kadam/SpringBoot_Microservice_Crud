package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		System.err.println(student);
		Student s1 = studentService.saveStudent(student);
		return ResponseEntity.ok().body(s1);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") int Id) {
		Student s2 = studentService.getStudent(Id);
		return ResponseEntity.ok().body(s2);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") int Id, @RequestBody Student student) {
		Student s3 = studentService.updateStudent(Id, student);
		return ResponseEntity.ok().body(s3);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("id") int Id) {
		studentService.deleteStudent(Id);
		return ResponseEntity.noContent().build();
	}
}
