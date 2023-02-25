package com.example.bowlersconnected.service;

import com.example.bowlersconnected.model.Bowler;

import java.util.List;

public interface BowlerService {
    public Bowler saveBowler(Bowler bowler);
    public List<Bowler> getAllBowlers();
}
