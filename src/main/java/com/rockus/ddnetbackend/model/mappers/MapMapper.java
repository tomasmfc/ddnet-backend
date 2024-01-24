package com.rockus.ddnetbackend.model.mappers;

import java.util.ArrayList;
import java.util.List;

import com.rockus.ddnetbackend.model.Map;
import com.rockus.ddnetbackend.model.dtos.MapDto;

public class MapMapper {
    public static MapDto toDto(Map map) {
        return new MapDto(map.getMap(), map.getServer(), map.getPoints(), map.getStars(), map.getMapper(),
                map.getTimestamp());
    }

    public static List<MapDto> toListDto(List<Map> maps) {
        List<MapDto> mapsDTO = new ArrayList<>();

        for (Map map : maps) {
            mapsDTO.add(toDto(map));
        }

        return mapsDTO;
    }
}
