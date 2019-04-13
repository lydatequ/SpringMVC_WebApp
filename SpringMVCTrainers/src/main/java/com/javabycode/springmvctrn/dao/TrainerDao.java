package com.javabycode.springmvctrn.dao;

import java.util.List;

import com.javabycode.springmvctrn.model.Trainer;

public interface TrainerDao {

	Trainer findById(int id);

	void saveTrainer(Trainer trainer);
	
	public void saveOrUpdate(Trainer trainer);
	
	void deleteTrainerById(int id);
	
	List<Trainer> findAllTrainers();

	Trainer editTrainerById(int id);

}
