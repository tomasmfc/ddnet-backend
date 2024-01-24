package com.rockus.ddnetbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.MapInfo;
import com.rockus.ddnetbackend.model.dtos.MapInfoDto;
import com.rockus.ddnetbackend.model.mappers.MapInfoMapper;
import com.rockus.ddnetbackend.repositories.MapInfoRepository;

@Service
public class MapInfoServiceImpl implements MapInfoService {

    @Autowired
    private MapInfoRepository mapInfoRepository;

    @Override
    public List<MapInfoDto> findAllMapsInfo() {

        List<MapInfo> allMapsInfo = mapInfoRepository.findAll();

        return MapInfoMapper.toDtoList(allMapsInfo);
    }

}
