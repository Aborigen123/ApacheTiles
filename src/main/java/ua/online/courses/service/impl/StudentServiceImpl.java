package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Student;
import ua.online.courses.repository.StudentRepository;
import ua.online.courses.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

	
	@Autowired //2-ий спосіб DI
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}
	
	
}
