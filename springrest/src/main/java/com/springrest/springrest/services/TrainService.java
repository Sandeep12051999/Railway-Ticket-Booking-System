package com.springrest.springrest.services;
import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.Train;
public interface TrainService {

	public List<Train> getTrains();

	public Optional<Train> getTrain(long trainId);
	
	public Train addTrain(Train course);
	
	public Train updateTrain(Train course);
	
	public void deleteTrain(long parseLong);
	
}
