package com.rockus.ddnetbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "maps")
@Getter
public class Map {
    @Id
    private String map;

    @Column
    private String server;

    @Column
    private int points;

    @Column
    private int stars;

    @Column
    private String mapper;

    @Column
    private String timestamp;
}
