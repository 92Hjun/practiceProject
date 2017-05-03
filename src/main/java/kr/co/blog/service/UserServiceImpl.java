package kr.co.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.blog.dao.UserDAO;
import kr.co.blog.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userService;
	
	@Override
	public void addUser(User user) {
		userService.addUser(user);
		
	}

	@Override
	public User searchUserById(String id) {
		return userService.searchUserById(id);
	}
	
}
