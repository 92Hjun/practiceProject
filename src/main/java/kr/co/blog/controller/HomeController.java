package kr.co.blog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.blog.service.TodoService;
import kr.co.blog.service.UserService;
import kr.co.blog.vo.Todo;
import kr.co.blog.vo.User;
@Controller
public class HomeController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@Autowired TodoService todoServiceImpl;
	
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public String goHome(Model model, HttpSession session) {
		
		User user = (User)session.getAttribute("LOGINUSER");
		if (user != null) {
			
			List<Todo> todoList = todoServiceImpl.getAllTodoByUserId(user.getId());
			model.addAttribute("todoList", todoList);
			return "home";
			
		}else {
			
			return "home";
			
		}
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginPro(String id, String pwd, HttpSession session){
		
		User user = userServiceImpl.searchUserById(id);
		if (user == null){
			
			return "login";
		}
		if (!pwd.equals(user.getPwd())) {
			
			return "login";
		}
		
		session.setAttribute("LOGINUSER", user);
		
		return "redirect:/home";
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String goLogin() {
		return "login";
	}
}
