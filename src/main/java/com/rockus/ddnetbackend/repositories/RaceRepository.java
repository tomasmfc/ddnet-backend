package com.rockus.ddnetbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rockus.ddnetbackend.model.Race;

@Repository
public interface RaceRepository extends JpaRepository<Race, String> {

    @Query("SELECT r FROM Race r WHERE r.name = :name ORDER BY r.timestamp ASC")
    List<Race> findRacesByName(@Param("name") String name);
}
