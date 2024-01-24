package com.rockus.ddnetbackend.services;

import java.util.List;

import com.rockus.ddnetbackend.model.dtos.MapInfoDto;

public interface MapInfoService {
    List<MapInfoDto> findAllMapsInfo();
}
