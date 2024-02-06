package com.rockus.ddnetbackend.repositories;

import org.springframework.stereotype.Repository;

import com.rockus.ddnetbackend.model.Map;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MapRepository extends JpaRepository<Map, String> {
}
