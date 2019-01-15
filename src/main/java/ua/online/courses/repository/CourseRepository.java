package ua.online.courses.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {//id в Course = Integer
	
	@Query("Select c from Course c where c.title=:title and c.price > :price")
Course findByTitle(@Param("title") String title, @Param("price") BigDecimal price);
	
}
