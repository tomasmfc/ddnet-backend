package com.rockus.ddnetbackend.services.Map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.Map;
import com.rockus.ddnetbackend.model.dtos.MapDto;
import com.rockus.ddnetbackend.model.mappers.MapMapper;
import com.rockus.ddnetbackend.repositories.MapRepository;

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapRepository mapRepository;

    public List<MapDto> findAllMaps() {
        List<Map> allMaps = mapRepository.findAll();

        List<MapDto> allMapsDTO = MapMapper.toListDto(allMaps);

        return allMapsDTO;
    }
}
