package com.rockus.ddnetbackend.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RaceDto {
    private String map;
    private String name;
    private String time;
    private String timestamp;
    private String server;
}
