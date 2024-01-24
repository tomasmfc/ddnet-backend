package com.rockus.ddnetbackend.services.TeamRace;

import java.util.List;

import com.rockus.ddnetbackend.model.dtos.TeamRaceDto;

public interface TeamRaceService {
    List<TeamRaceDto> getTeamRacesForMap();
}
