package com.rockus.ddnetbackend.services.Race;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.Race;
import com.rockus.ddnetbackend.model.dtos.RaceDto;
import com.rockus.ddnetbackend.model.mappers.RaceMapper;
import com.rockus.ddnetbackend.repositories.RaceRepository;

@Service
public class RaceServiceImpl implements RaceService {

    @Autowired
    private RaceRepository raceRepository;

    @Override
    public List<RaceDto> getRacesByName(String name) {
        List<Race> raceList = raceRepository.findRacesByName(name);

        if (raceList == null) {
            return null;
        }

        return RaceMapper.toDtoList(raceList);
    }

    @Override
    public int getPointsByName(String name) {
        int pointsByName = raceRepository.getPlayerPoints(name);

        // TODO: improve error handling
        if (pointsByName < 0) {
            return -1;
        }

        return pointsByName;
    }

    @Override
    public List<RaceDto> getLatestRacesGlobal() {
        Page<Race> races = raceRepository.findAll(PageRequest.of(0, 20));

        List<RaceDto> racesDtos = RaceMapper.toDtoList(races.getContent());

        return racesDtos;
    }

    @Override
    public RaceDto getFirstFinishForPlayer(String name) {
        Race race = raceRepository.getFirstFinishForPlayer(name, Limit.of(1));

        RaceDto raceDto = RaceMapper.toDto(race);

        return raceDto;
    }

}
