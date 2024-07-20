package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{name}")
    public ResponseEntity<List<RaceDto>> getRacesByName(@PathVariable("name") String name) {
        try {
            List<RaceDto> racesByName = raceService.getRacesByName(name);

            return ResponseEntity.ok().body(racesByName);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @GetMapping("/points/{name}")
    public ResponseEntity<Integer> getPointsByName(@PathVariable("name") String name) {
        try {
            int pointsByName = raceService.getPointsByName(name);

            return ResponseEntity.ok().body(pointsByName);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @GetMapping("/latest")
    public ResponseEntity<List<RaceDto>> getLatestRacesGlobal() {
        try {
            List<RaceDto> racesDtos = raceService.getLatestRacesGlobal();

            return ResponseEntity.ok().body(racesDtos);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @GetMapping("/first/{name}")
    public ResponseEntity<RaceDto> getPlayerFirstFinish(@PathVariable("name") String name) {
        try {
            RaceDto raceDto = raceService.getFirstFinishForPlayer(name);

            return ResponseEntity.ok().body(raceDto);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }
}
