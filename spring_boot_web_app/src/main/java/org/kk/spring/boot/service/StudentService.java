package org.kk.spring.boot.service;

import java.util.List;

import org.kk.spring.boot.model.Student;

public interface StudentService {

	public Long save(Student student);
	
	public List<Student> getAllStudent();
	
	public Student findByAge(Integer age);
	
	public void updateStudent(Student student);
	
	public Student getStudentById(Long sid);
	
	public void deleteByStudentId(Long sid);
}
