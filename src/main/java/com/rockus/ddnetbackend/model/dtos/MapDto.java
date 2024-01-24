package com.rockus.ddnetbackend.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MapDto {
    private String map;

    private String server;

    private int points;

    private int stars;

    private String mapper;

    private String timestamp;
}
