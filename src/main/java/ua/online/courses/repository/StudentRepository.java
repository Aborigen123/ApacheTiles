package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
