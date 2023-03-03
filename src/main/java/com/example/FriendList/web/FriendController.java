package com.example.FriendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FriendList.domain.Friend;

@Controller
public class FriendController {

	private List<Friend> friendList = new ArrayList<Friend>();

	// Default method is GET so perhaps we could skip it.
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(@RequestParam(name = "friend", required = false) String name, Model model) {
		friendList = new ArrayList<Friend>();
		model.addAttribute("friend", new Friend()); 
		return "index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute(name = "friend") Friend friend, Model model) {
		friendList.add(friend);
		model.addAttribute("friendList", friendList);

		return "index";
	}
}
