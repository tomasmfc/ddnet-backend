package com.rockus.ddnetbackend.services.Map;

import java.util.List;

import com.rockus.ddnetbackend.model.dtos.MapDto;

public interface MapService {
    List<MapDto> findAllMaps();
}
