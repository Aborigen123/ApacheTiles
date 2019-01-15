package ua.online.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.online.courses.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
