package com.galaxy.docman.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.docman.models.db.Player;
import com.galaxy.docman.models.db.Team;
import com.galaxy.docman.repository.TeamRepository;
import com.galaxy.docman.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
    
    @Autowired
    private TeamRepository teamRepository;
    
    @Override
    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    @PostConstruct
    public void init(){
        List<Team> teams = new ArrayList<Team>();
        Team team1 = new Team();
        team1.setCountry("London");
        team1.setName("Blackhawks");
        Team team2 = new Team();
        team2.setCountry("Chicago");
        team2.setName("Cubs");
        Player player1 = new Player();
        player1.setName("Messi");
        player1.setPosition("Stricker");
        team1.getPlayers().add(player1);
        Player player2 = new Player();
        player2.setName("Messi");
        player2.setPosition("Stricker");
        team1.getPlayers().add(player2);
        teams.add(team1);
        teams.add(team2);
        teamRepository.save(teams);
        
    }

    @Override
    public Team getTeam(Integer id) {
        return teamRepository.findOne(id);
    }
}
