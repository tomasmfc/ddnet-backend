package com.rockus.ddnetbackend.services.Race;

import java.util.List;

import com.rockus.ddnetbackend.model.dtos.RaceDto;

public interface RaceService {
    List<RaceDto> getRacesByName(String name);

    int getPointsByName(String name);

    List<RaceDto> getLatestRacesGlobal();

    RaceDto getFirstFinishForPlayer(String name);
}
