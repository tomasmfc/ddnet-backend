package com.rockus.ddnetbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rockus.ddnetbackend.model.MapInfo;

@Repository
public interface MapInfoRepository extends JpaRepository<MapInfo, String> {

}
