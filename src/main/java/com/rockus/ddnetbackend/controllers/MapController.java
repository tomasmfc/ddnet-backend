package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockus.ddnetbackend.controllers.request_bodies.PageBody;
import com.rockus.ddnetbackend.model.dtos.MapDto;
import com.rockus.ddnetbackend.services.Map.MapService;

@RestController
@RequestMapping("/maps")
public class MapController {

    @Autowired
    private MapService mapService;

    @PostMapping
    public ResponseEntity<List<MapDto>> findMapsByPage(@RequestBody PageBody pageBody) {
        List<MapDto> mapsByPage = mapService.findMapsByPage(pageBody.getPageNumber(), pageBody.getPageSize());
        return ResponseEntity.ok().body(mapsByPage);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> findAllMapsCount() {
        long allMapsCount = mapService.getAllMapsCount();
        return ResponseEntity.ok().body(allMapsCount);
    }

    @GetMapping
    public ResponseEntity<List<MapDto>> findAllMaps() {
        List<MapDto> allMaps = mapService.findAllMaps();
        return ResponseEntity.ok().body(allMaps);
    }

}
