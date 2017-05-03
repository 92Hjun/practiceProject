package kr.co.blog.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.blog.service.UserService;
import kr.co.blog.vo.AddUserForm;
import kr.co.blog.vo.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping(value="adduser", method=RequestMethod.GET)
	public String goAddUser (Model model) {
		model.addAttribute("addUserForm", new AddUserForm());
		
		return "adduser";
	}
	
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public String addUser(@Valid AddUserForm addUserForm, Errors error){
		if (error.hasErrors()) {
			return "adduser";
		}
		
		User user = new User();
		
		BeanUtils.copyProperties(addUserForm, user);
		
		userServiceImpl.addUser(user);
			
		return "login";
	}
	
	@RequestMapping("logout")
	public String logout (HttpSession session){
		
		session.invalidate();
		
		return "redirect:/home";
	}
}
