package org.example.islamprojectrk.controller;

import org.example.islamprojectrk.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService service;

    public UserController(UserService s)
    {
        this.service=s;
    }

    @GetMapping("/")
    public String searchForm(){
        return "search";
    }

    @GetMapping("/search")
    public String doSearch(@RequestParam String q, Model model){
        var results = service.searchByTitle(q);
        model.addAttribute("users", results);
        return "results";
    }
}

