package com.rockus.ddnetbackend.services.Race;

import java.util.List;

import com.rockus.ddnetbackend.model.dtos.RaceDto;

public interface RaceService {
    List<RaceDto> getRacesByName();
}
