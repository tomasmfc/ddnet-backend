package com.rockus.ddnetbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockus.ddnetbackend.model.MapInfo;
import com.rockus.ddnetbackend.services.MapInfoService;

@RestController
@RequestMapping("/mapinfo")
public class MapInfoController {

    @Autowired
    private MapInfoService mapInfoService;

    @GetMapping
    public ResponseEntity<List<MapInfo>> findAllMapsInfo() {

        List<MapInfo> allMapsInfo = mapInfoService.findAllMapsInfo();

        return ResponseEntity.ok().body(allMapsInfo);
    }
}
