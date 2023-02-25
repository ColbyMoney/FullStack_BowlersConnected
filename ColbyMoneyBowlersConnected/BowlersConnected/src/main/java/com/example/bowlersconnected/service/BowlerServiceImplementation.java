package com.example.bowlersconnected.service;

import com.example.bowlersconnected.model.Bowler;
import com.example.bowlersconnected.repository.BowlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BowlerServiceImplementation implements BowlerService {
    @Autowired
    private BowlerRepository bowlerRepository;

    @Override
    public Bowler saveBowler(Bowler bowler) { return bowlerRepository.save(bowler); }

    @Override
    public List<Bowler> getAllBowlers() { return bowlerRepository.findAll(); }
}
