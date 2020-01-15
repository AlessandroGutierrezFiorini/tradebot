package com.trade.bot.controller;

import com.trade.bot.model.Bot;
import com.trade.bot.repository.BotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/demo")
public class BotController {

    @Autowired
    private BotRepository botRepository;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String addBot(@RequestParam String name, @RequestParam String email) {

        Bot n = new Bot();
        n.setName(name);
        botRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Bot> getAllUsers() {

        return botRepository.findAll();
    }
}
