package com.org.dxc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.model.Student;
import com.org.dxc.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudent() {
	return studentRepository.findAll();
	
	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void Save(Student student) {
		studentRepository.save(student);
	}
	
	public void Delete(int id) {
		studentRepository.deleteById(id);
	}
	
	public void Update(Student student, int studentid) {
		studentRepository.save(student);
	}
}
