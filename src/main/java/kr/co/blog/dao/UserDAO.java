package kr.co.blog.dao;

import kr.co.blog.vo.User;

public interface UserDAO {

	void addUser(User user);
	
	User searchUserById(String id);
}
