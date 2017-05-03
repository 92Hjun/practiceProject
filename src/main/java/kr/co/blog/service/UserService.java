package kr.co.blog.service;

import kr.co.blog.vo.User;

public interface UserService {
	
	void addUser(User user);
	User searchUserById(String id);
}
