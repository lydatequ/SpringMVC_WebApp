package com.javabycode.springmvctrn.service;

import java.util.List;

import com.javabycode.springmvctrn.model.Trainer;

public interface TrainerService {

	Trainer findById(int id);
	
	void saveTrainer(Trainer trainer);
	
	void updateTrainer(Trainer trainer);
	
	void deleteTrainerById(int id);

	List<Trainer> findAllTrainers(); 
	
	Trainer editTrainerById(int id);
        

	
}
