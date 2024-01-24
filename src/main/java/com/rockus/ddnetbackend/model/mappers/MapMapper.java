package com.rockus.ddnetbackend.model.mappers;

import java.util.ArrayList;
import java.util.List;

import com.rockus.ddnetbackend.model.Map;
import com.rockus.ddnetbackend.model.dtos.MapDto;

public class MapMapper {
    public static MapDto toDTO(Map map) {
        return new MapDto(map.getMap(), map.getServer(), map.getPoints(), map.getStars(), map.getMapper(),
                map.getTimestamp());
    }

    public static List<MapDto> toListDTO(List<Map> maps) {
        List<MapDto> mapsDTO = new ArrayList<>();

        for (Map map : maps) {
            mapsDTO.add(toDTO(map));
        }

        return mapsDTO;
    }
}
