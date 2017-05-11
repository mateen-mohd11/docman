package com.galaxy.docman.models.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Player {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String position;
}
