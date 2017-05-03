package kr.co.blog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.blog.service.TodoService;
import kr.co.blog.vo.Todo;
import kr.co.blog.vo.User;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoServiceImpl;
	
	@RequestMapping(value="/addTodo", method=RequestMethod.POST)
	public String addTodo(String title, String contents, String startDate,HttpSession session){
		
		User user = (User)session.getAttribute("LOGINUSER");
		if (user == null) {
			return "login";
		}
		
		Todo todo = new Todo();
		String[] date = startDate.split(",");
		
		todo.setUserId(user.getId());
		todo.setTitle(title);
		todo.setContents(contents);
		todo.setStartDate(date[0]);
		todo.setEndDate(date[1]);
		
		todoServiceImpl.addTodo(todo);
		
		return "redirect:/home";
	}
	
	@RequestMapping(value="/deleteTodo", method=RequestMethod.POST)
	public @ResponseBody Todo deleteTodo(String todoNo){
		todoServiceImpl.deleteTodo(todoNo);
		
		return todoServiceImpl.getTodoByTodoNo(todoNo);
	}
}
