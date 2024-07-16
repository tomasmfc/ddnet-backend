package com.rockus.ddnetbackend.model.mappers;

import java.util.ArrayList;
import java.util.List;

import com.rockus.ddnetbackend.model.Race;
import com.rockus.ddnetbackend.model.dtos.RaceDto;

public class RaceMapper {
    public static RaceDto toDto(Race race) {
        return new RaceDto(race.getMap().toString(), race.getName(), race.getTime(), race.getTimestamp().toString(),
                race.getServer());
    }

    public static List<RaceDto> toDtoList(List<Race> raceList) {
        List<RaceDto> raceDtoList = new ArrayList<>();

        for (Race race : raceList) {
            raceDtoList.add(toDto(race));
        }

        return raceDtoList;
    }
}
