package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Train;
import com.springrest.springrest.services.TrainService;

@RestController
public class MyController {
	@Autowired
	private TrainService trainService;
	
	
	@GetMapping("/trains")
	public List<Train> getTrains(){
		return this.trainService.getTrains();
	}
	
	@GetMapping("/trains/{trainId}")
	public Optional<Train> getTrain(@PathVariable String trainId) {
	 return this.trainService.getTrain(Long.parseLong(trainId));	
	}
	
	@PostMapping("/trains")
	public Train addTrain(@RequestBody Train course) {
		return this.trainService.addTrain(course);
	}
	
	@PutMapping("/trains")
	public Train updateTrain(@RequestBody Train course) {
		return this.trainService.updateTrain(course);
	}
	
	@DeleteMapping("/trains/{trainId}")
	public ResponseEntity<HttpStatus> deleteTrain(@PathVariable String trainId){
		try {
			this.trainService.deleteTrain(Long.parseLong(trainId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
