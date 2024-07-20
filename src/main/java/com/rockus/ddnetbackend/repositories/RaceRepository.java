package com.rockus.ddnetbackend.repositories;

import java.util.List;

import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rockus.ddnetbackend.model.Race;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {

    @Query("SELECT r FROM Race r WHERE r.name = :name ORDER BY r.timestamp ASC")
    List<Race> findRacesByName(@Param("name") String name);

    // TODO: cache these values somehow
    // TODO: change this query to jpql so it is compatible with all databases
    @Query(value = "SELECT sum(points) AS total_points FROM (select distinct(race.map), name, points from race join maps ON race.map=maps.map where name = :name)", nativeQuery = true)
    int getPlayerPoints(@Param("name") String name);

    @Query("SELECT r FROM Race r WHERE r.name = :name ORDER BY r.timestamp ASC")
    Race getFirstFinishForPlayer(@Param("name") String name, Limit limit);
}
