package com.example.bowlersconnected.controller;

import com.example.bowlersconnected.model.Bowler;
import com.example.bowlersconnected.service.BowlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bowler")
@CrossOrigin
public class BowlerController {
    @Autowired
    private BowlerService bowlerService;

    @PostMapping("/add")
    public String add(@RequestBody Bowler bowler) {
        bowlerService.saveBowler(bowler);
        return "New bowler is added";
    }

    @GetMapping("/getAll")
    public List<Bowler> list() { return bowlerService.getAllBowlers(); }
}
