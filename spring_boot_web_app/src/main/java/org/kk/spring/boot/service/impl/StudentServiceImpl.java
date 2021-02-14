package org.kk.spring.boot.service.impl;

import java.util.List;

import org.kk.spring.boot.model.Student;
import org.kk.spring.boot.repository.StudentRepository;
import org.kk.spring.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public Long save(Student student) {
		return studentRepository.save(student).getSid();
	}

	@Transactional (readOnly = true)
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Transactional (readOnly = true)
	public Student findByAge(Integer age) {
		return studentRepository.findByAge(age);
	}

	@Transactional 
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Transactional (readOnly = true)
	public Student getStudentById(Long sid) {
		return studentRepository.getOne(sid);
	}

	@Override
	public void deleteByStudentId(Long sid) {
		studentRepository.deleteById(sid);
	}
	
}
