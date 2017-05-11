package com.galaxy.docman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.galaxy.docman.models.db.Player;
@RestResource(path="players", rel="player")
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
