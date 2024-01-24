package com.rockus.ddnetbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.MapInfo;
import com.rockus.ddnetbackend.repositories.MapInfoRepository;

@Service
public class MapInfoServiceImpl implements MapInfoService {

    @Autowired
    private MapInfoRepository mapInfoRepository;

    @Override
    public List<MapInfo> findAllMapsInfo() {
        return mapInfoRepository.findAll();
    }

}
