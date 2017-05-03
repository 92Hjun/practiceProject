package kr.co.blog.service;

import java.util.List;

import kr.co.blog.vo.Todo;

public interface TodoService {

	void addTodo(Todo todo);

	List<Todo> getAllTodoByUserId(String id);

	void deleteTodo(String todoNo);

	Todo getTodoByTodoNo(String todoNo);

}
