package ua.online.courses.controller;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.Course;
import ua.online.courses.service.CourseServise;

@Controller
@RequestMapping("/course")//localhost:8080/ROOT/course/
public class CourseController {
	
	@Autowired
	private CourseServise courseServise;
	
	

	@GetMapping("/add")//localhost:8080/ROOT/course/add
	public String showAddCoursePage() {
		return "course/add-course";
	}
	@GetMapping("/list")//localhost:8080/ROOT/course/list
	public String showCoursesList(Model model) {
		model.addAttribute("coursesList", courseServise.findAllCourses());
		return "course/courses-list";
	}
	
	@PostMapping("/add")
	public String saveCourse(//після заповнення
		@RequestParam("title") String title,
		@RequestParam("description") String description,
		@RequestParam("price") BigDecimal price 
	){
		System.out.println(title + description + price);
		Course course = new Course();
	course.setTitle(title);
	course.setDescription(description);
	course.setPrice(price);
	
	courseServise.saveCourse(course);
	
		return "redirect:/course/list";
	}

	@GetMapping("/{courseId}/edit")
	public String editCourse(Model model, @PathVariable("courseId") int id) {
	Course course = courseServise.findCourseById(id);
		model.addAttribute("course", course);
		System.out.println(course);
		return "course/add-course";
	}
	
}
