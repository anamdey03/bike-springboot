package com.practice.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
