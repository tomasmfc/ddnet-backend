package com.rockus.ddnetbackend.model.mappers;

import java.util.ArrayList;
import java.util.List;

import com.rockus.ddnetbackend.model.TeamRace;
import com.rockus.ddnetbackend.model.dtos.TeamRaceDto;

public class TeamRaceMapper {
    public static TeamRaceDto toDto(TeamRace teamRace) {
        return new TeamRaceDto(teamRace.getId(), teamRace.getMap(), teamRace.getName(), teamRace.getTime(),
                teamRace.getTimestamp());
    }

    public static List<TeamRaceDto> toDtoList(List<TeamRace> teamRaceList) {
        List<TeamRaceDto> teamRaceDtoList = new ArrayList<>();

        for (TeamRace teamRace : teamRaceList) {
            teamRaceDtoList.add(toDto(teamRace));
        }

        return teamRaceDtoList;
    }
}
