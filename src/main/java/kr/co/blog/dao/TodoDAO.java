package kr.co.blog.dao;

import java.util.List;

import kr.co.blog.vo.Todo;

public interface TodoDAO {

	void addTodo(Todo todo);

	List<Todo> getAllTodoByUserId(String userId);

	void deleteTodo(int todoNo);

	Todo getTodoByTodoNo(int parseInt);

}
