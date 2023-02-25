package com.example.bowlersconnected.repository;

import com.example.bowlersconnected.model.Bowler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BowlerRepository extends JpaRepository<Bowler, Integer>{
}
