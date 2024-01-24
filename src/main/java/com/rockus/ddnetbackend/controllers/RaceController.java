package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.rockus.ddnetbackend.model.dtos.RaceDto;
import com.rockus.ddnetbackend.services.Race.RaceService;

@RestController
@RequestMapping("/race")
public class RaceController {

    @Autowired
    private RaceService raceService;

    @GetMapping
    public ResponseEntity<List<RaceDto>> getRacesByName() {
        try {
            List<RaceDto> racesByName = raceService.getRacesByName();

            return ResponseEntity.ok().body(racesByName);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }
}
