package com.joker.hm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.joker.hm.pojo.User;
import com.joker.hm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		String userId = request.getParameter("id");
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
