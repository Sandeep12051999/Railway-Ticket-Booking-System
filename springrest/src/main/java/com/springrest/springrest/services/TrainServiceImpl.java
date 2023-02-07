package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.TrainDao;
import com.springrest.springrest.entities.Train;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainDao trainDao;
//	List<Course>list;
	
	public TrainServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(123,"java" , "java Course"));
//		list.add(new Course(321 , "Spring Boot", "spring boot course"));
	}
	
	@Override
	public List<Train> getTrains() {
		return trainDao.findAll();
	}
	
	@Override
	public Optional<Train> getTrain(long trainId) {
		
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c = course;
//				break;
//			}
//		}
		return trainDao.findById(trainId);
	}

	@Override
	public Train addTrain(Train course) {
//		list.add(course);
		trainDao.save(course);
		return course;
	}

	@Override
	public Train updateTrain(Train course) {
//        list.forEach(e ->{
//        	if(e.getId() == course.getId()) {
//        		e.setTitle(course.getTitle());
//        		e.setDescription(course.getDescription());
//        	}
//        });
		trainDao.save(course);
        return course;
	}
	
	public void deleteTrain(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
	Train entity = trainDao.getOne(parseLong);
	trainDao.delete(entity);
	}

}
