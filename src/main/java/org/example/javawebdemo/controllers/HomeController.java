package org.example.javawebdemo.controllers;


import org.example.javawebdemo.models.HockeyPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;

    @GetMapping("/")
    public String home(Model model) {
        // Häömta saker från databas - tex en lista med HpockeyPlayers
        // bla
        model.addAttribute("players", hockeyPlayerRepository.findAll());
        model.addAttribute("user", "Stefan");
        int i;
        i = 99;

        return "home"; // namnet på HTML filen som ska visas
    }

    @GetMapping("/profile")
    public String profile() {

        return "profile";
    }
}
