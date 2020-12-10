package com.org.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.model.Student;
import com.org.dxc.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService studentService;{
		
	}
	
	@GetMapping("/student")
	private List<Student> getAllStudent(){
		return studentService.getAllStudent();	
	}
	
	@PostMapping("/student/{studentid}")
	private  Student getStudent(@PathVariable("studentid")int studentid)
	{
		return studentService.getStudentById(studentid);
	}
	@DeleteMapping("/student/{studentid}")
	private void delete(@PathVariable("studentid") int studentid)
	{
		studentService.Delete(studentid);
	}
	@PostMapping("/student")
	private int save(@RequestBody Student student)
	{
		studentService.Save(student);
		return student.getStudentid();
	}
	@PutMapping("/student")
	private Student update(@RequestBody Student student)
	{
		studentService.Save(student);
		return student;
	}
}
