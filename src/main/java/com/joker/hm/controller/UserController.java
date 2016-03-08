package com.joker.hm.controller;

import com.alibaba.fastjson.JSON;
import com.joker.hm.pojo.User;
import com.joker.hm.service.IUserService;
import com.joker.hm.util.Global;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public void toIndex(HttpServletRequest request, Model model, HttpServletResponse response){
		String userId = request.getParameter("id");
		User user = this.userService.getUserById(userId);
//		model.addAttribute("user", user);
//		return "showUser";
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute(Global.Key.USER, user);
		model.addAttribute(Global.Key.STATUE, response.getStatus());
		out.print(JSON.toJSONString(model));
	}
}
