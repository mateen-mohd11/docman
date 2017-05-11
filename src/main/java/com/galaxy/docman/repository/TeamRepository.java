package com.galaxy.docman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.galaxy.docman.models.db.Team;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
