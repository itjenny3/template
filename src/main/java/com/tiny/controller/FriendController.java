package com.tiny.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tiny.service.FacebookService;

@Controller
public class FriendController {
	private static final Logger LOGGER = LoggerFactory.getLogger(FriendController.class);

	@Autowired
	private FacebookService facebookService;

	@RequestMapping(value = { "/friend" }, method = RequestMethod.GET)
	public ModelAndView getFriends() {
		ModelAndView mav = new ModelAndView();
		ModelMap model = new ModelMap();
		model.addAttribute("friends", facebookService.getFriends());
		mav.addAllObjects(model);
		mav.setViewName("friend");
		return mav;
	}
}