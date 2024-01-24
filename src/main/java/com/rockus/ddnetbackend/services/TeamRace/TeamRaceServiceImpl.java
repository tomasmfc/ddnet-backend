package com.rockus.ddnetbackend.services.TeamRace;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.TeamRace;
import com.rockus.ddnetbackend.model.dtos.TeamRaceDto;
import com.rockus.ddnetbackend.model.mappers.TeamRaceMapper;
import com.rockus.ddnetbackend.repositories.TeamRaceRepository;

@Service
public class TeamRaceServiceImpl implements TeamRaceService {

    @Autowired
    private TeamRaceRepository teamRaceRepository;

    @Override
    public List<TeamRaceDto> getTeamRacesForMap() {
        List<TeamRace> teamRacesForMapList = teamRaceRepository.findTeamRaceByMap("Arctic Frost");

        return TeamRaceMapper.toDtoList(teamRacesForMapList);
    }

}
