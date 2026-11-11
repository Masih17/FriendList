
package com.example.FriendList.web;

import com.example.FriendList.domain.Friend;
import com.example.FriendList.repository.FriendRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FriendController {

    private final FriendRepository friendRepository;

    public FriendController(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("friend", new Friend());
        model.addAttribute("friendList", friendRepository.findAll());
        return "index";
    }

    @GetMapping("/index")
    public String addFriend(@ModelAttribute("friend") Friend friend) {
        friendRepository.save(friend);
        return "redirect:/home";
    }
}
