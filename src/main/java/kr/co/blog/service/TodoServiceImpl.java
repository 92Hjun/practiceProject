package kr.co.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.blog.dao.TodoDAO;
import kr.co.blog.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDAO todoDAO;

	@Override
	public void addTodo(Todo todo) {
		todoDAO.addTodo(todo);
		
	}

	@Override
	public List<Todo> getAllTodoByUserId(String userId) {
		return todoDAO.getAllTodoByUserId(userId);
	}

	@Override
	public void deleteTodo(String todoNo) {
		todoDAO.deleteTodo(Integer.parseInt(todoNo));
		
	}

	@Override
	public Todo getTodoByTodoNo(String todoNo) {
		return todoDAO.getTodoByTodoNo(Integer.parseInt(todoNo));
	}
}
