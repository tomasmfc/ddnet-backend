package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockus.ddnetbackend.model.dtos.TeamRaceDto;
import com.rockus.ddnetbackend.services.TeamRace.TeamRaceService;

@RestController
@RequestMapping("/teamrace")
public class TeamRaceController {

    @Autowired
    private TeamRaceService teamRaceService;

    @GetMapping
    public ResponseEntity<List<TeamRaceDto>> getAllTeamRaces() {

        List<TeamRaceDto> teamRacesForMapDto = teamRaceService.getTeamRacesForMap();

        return ResponseEntity.ok().body(teamRacesForMapDto);
    }
}
