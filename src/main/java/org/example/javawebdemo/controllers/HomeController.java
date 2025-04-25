package org.example.javawebdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        // Häömta saker från databas - tex en lista med HpockeyPlayers
        List<String> players = new ArrayList<>();
        players.add("Foppa");
        players.add("Zäta");
        players.add("Stefan");
        model.addAttribute("players", players);
        model.addAttribute("user", "Stefan");

        return "home"; // namnet på HTML filen som ska visas
    }

    @GetMapping("/profile")
    public String profile() {

        return "profile";
    }
}
