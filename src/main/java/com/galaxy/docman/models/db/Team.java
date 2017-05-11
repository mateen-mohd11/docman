package com.galaxy.docman.models.db;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Team {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String country;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players = new HashSet<>();
}
