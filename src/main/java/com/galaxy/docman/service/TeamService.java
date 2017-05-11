package com.galaxy.docman.service;

import java.util.List;

import com.galaxy.docman.models.db.Team;

public interface TeamService {

    List<Team> getAllTeams();

    Team getTeam(Integer id);

}