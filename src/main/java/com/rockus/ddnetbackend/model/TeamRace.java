package com.rockus.ddnetbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "teamrace")
@Getter
public class TeamRace {
    @Id
    private String id;
    @Column
    private String map;
    @Column
    private String name;
    @Column
    private String time;
    @Column
    private String timestamp;
}