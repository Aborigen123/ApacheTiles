package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.online.courses.entity.Student;
import ua.online.courses.entity.StudentDegree;
import ua.online.courses.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/add")
	public String showAddForm(Model model) {
		LinkedHashMap<String, String> countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		countryOptions.put("UA", "Ukraine");
		
		List<String> radioOptions = new ArrayList<>();
		radioOptions.add("Java");
		radioOptions.add("PHP");
		radioOptions.add("JS");
		
		model.addAttribute("studentDegrees", StudentDegree.values());//  StudentDegree.values() - StudentDegree перетворюємо в масив
		model.addAttribute("languageList", radioOptions);
		model.addAttribute("countryList", countryOptions);
		model.addAttribute("studentModel", new Student());
		return  "student/add";
	}
	
	@PostMapping("/add")
	public String save(@ModelAttribute("studentModel") Student student) {
		studentService.saveStudent(student);
	return "redirect:/student/list";
}
	
	@GetMapping("/list")
	public String showListForm(Model model) {
		model.addAttribute("studentList", studentService.findAllStudent());//к зчитати значення з checkbox
		return  "student/list";
	}
}

