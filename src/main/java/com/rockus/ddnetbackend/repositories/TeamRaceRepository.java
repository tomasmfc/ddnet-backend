package com.rockus.ddnetbackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rockus.ddnetbackend.model.TeamRace;

@Repository
public interface TeamRaceRepository extends JpaRepository<TeamRace, String> {
    @Query("SELECT tr FROM TeamRace tr WHERE tr.map = :map ORDER BY tr.time ASC LIMIT 10")
    List<TeamRace> findTeamRaceByMap(@Param("map") String map);
}
