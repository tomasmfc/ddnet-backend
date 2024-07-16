package com.rockus.ddnetbackend.services.Race;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
