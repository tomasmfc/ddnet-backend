package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockus.ddnetbackend.model.dtos.MapDto;
import com.rockus.ddnetbackend.services.MapService;

@RestController
@RequestMapping("/maps")
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping
    public ResponseEntity<List<MapDto>> findAllMaps() {
        List<MapDto> allMaps = mapService.findAllMaps();
        return ResponseEntity.ok().body(allMaps);
    }

}
