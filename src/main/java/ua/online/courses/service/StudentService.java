package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Student;

public interface StudentService  {

	void saveStudent(Student student);
	
	List<Student> findAllStudent();
	
	
}
