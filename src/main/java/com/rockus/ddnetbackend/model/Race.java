package com.rockus.ddnetbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "race")
public class Race {
    @Id
    private String map;
    @Column
    private String name;
    @Column
    private String time;
    @Column
    // @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private String timestamp;
    @Column
    private String server;
}
