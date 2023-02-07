package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Train;

 public interface TrainDao extends JpaRepository <Train, Long> {

}
