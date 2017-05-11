package com.galaxy.docman.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.docman.models.db.Team;
import com.galaxy.docman.service.TeamService;

public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getTeams() {
        return teamService.getAllTeams();
    }
    
    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable("id") Integer id){
        Team team = teamService.getTeam(id);
        return team;
    }

}
