package com.springBoot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.springBoot.service.UserService;
import java.util.List;

import com.springBoot.model.UserInfo;
import com.springBoot.model.UserRecord;

@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping("/Users")
	public List<UserRecord> UsersPage() {
		return userservice.getAllUsers();
	}

	@GetMapping("/Home")
	public ModelAndView HomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public ModelAndView getUsers(Model model) {
	    List<UserInfo> users = userservice.getUsers();
	    model.addAttribute("users", users);
	    model.addAttribute("userInfo", new UserInfo());
	    ModelAndView mv = new ModelAndView();
		mv.setViewName("users");
	    return mv;
	  }

	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public String createUser(Model model, @ModelAttribute UserInfo userInfo) {
	    UserInfo user = userservice.createUser(userInfo);
	    return "redirect:/users/";
	  }
}
