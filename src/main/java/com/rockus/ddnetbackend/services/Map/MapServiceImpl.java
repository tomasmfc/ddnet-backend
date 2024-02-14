package com.rockus.ddnetbackend.services.Map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rockus.ddnetbackend.model.Map;
import com.rockus.ddnetbackend.model.dtos.MapDto;
import com.rockus.ddnetbackend.model.mappers.MapMapper;
import com.rockus.ddnetbackend.repositories.MapRepository;

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapRepository mapRepository;

    @Value("${maps.page.size}")
    private int pageSize;

    public List<MapDto> findMapsByPage(int pageNumber) {

        Page<Map> allMaps = mapRepository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Sort.Direction.DESC, "timestamp")));

        List<MapDto> allMapsDTO = MapMapper.toListDto(allMaps.getContent());

        return allMapsDTO;
    }

    public long getAllMapsCount() {
        return mapRepository.count();
    }

    public List<MapDto> findAllMaps() {
        List<Map> allMaps = mapRepository.findAll();
        return MapMapper.toListDto(allMaps);
    }

}
