package org.kk.spring.boot.controller;


import java.util.List;

import org.kk.spring.boot.model.Address;
import org.kk.spring.boot.model.Student;
import org.kk.spring.boot.service.AddressService;
import org.kk.spring.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping ("/register")
	public String registerStudent(ModelMap map) {
		map.addAttribute("student", new Student());
		map.addAttribute("address", addressService.getAllAddress());
		map.addAttribute("Mode", "EDIT");
		return "student_register";
	}
	
	@RequestMapping (value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student, ModelMap map) {
		//call the service method
		Long id = service.save(student);
		map.addAttribute("message", "Student ID '" + id + " ' Created");
		map.addAttribute("address", new Address());
		map.addAttribute("student", new Student());
		return "student_register";
	}
	
	@GetMapping ("/showAll")
	public String showAllStudent(ModelMap map) {
		List<Student> listStudents = service.getAllStudent();
		map.addAttribute("lists", listStudents);
		return "student_data";
	}
	
	@RequestMapping ("/students/{age}")
	public Student getStudentAge(@PathVariable int age) {
		return service.findByAge(age);
	}
	
	@RequestMapping ("/getOne/{sid}")
	public String getOneStudent(@PathVariable Long sid, ModelMap map) throws Exception{
		Student student = service.getStudentById(sid);
		map.addAttribute("getOneStudent", student);
		return "view";
	}
	
	@RequestMapping (value = "/edit")
	public String editStudentById(@RequestParam Long sid, ModelMap map) {
		service.getStudentById(sid);
		Student student =service.getStudentById(sid);
		//From BACKING OBJECT
		map.addAttribute("student", student);
		map.addAttribute("Mode", "REGISTER");
		return "student_edit";
	}
	
	@RequestMapping ("/update")
	public String updateStudent(@ModelAttribute Student student) {
		service.updateStudent(student);
		return "redirect:showAll";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam Long sid) {
		service.deleteByStudentId(sid);
		return "redirect:users";
	}
}

