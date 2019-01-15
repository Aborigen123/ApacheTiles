package ua.online.courses.service;

import ua.online.courses.entity.User;

public interface UserService {

	void save(User user);
	
	User findById(int id);
	
}
