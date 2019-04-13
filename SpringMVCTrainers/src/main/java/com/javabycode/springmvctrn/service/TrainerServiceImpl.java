package com.javabycode.springmvctrn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javabycode.springmvctrn.dao.TrainerDao;
import com.javabycode.springmvctrn.model.Trainer;

@Service("trainerService")
@Transactional
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	private TrainerDao dao;
	
        @Override
	public Trainer findById(int id) {
		return dao.findById(id);
	}

        @Override
	public void saveTrainer(Trainer trainer) {
		dao.saveTrainer(trainer);
	}
	
        
        @Override
	public void updateTrainer(Trainer trainer) {
		Trainer entity = dao.findById(trainer.getId());
		if(entity!=null){
			entity.setFirstName(trainer.getFirstName());
                        entity.setLastName(trainer.getLastName());
			entity.setSubject(trainer.getSubject());
			//dao.saveOrUpdate(student);
		}
	}

        @Override
	public void deleteTrainerById(int id) {
		dao.deleteTrainerById(id);
	}
        
        @Override
        public Trainer editTrainerById (int id){
            return dao.editTrainerById(id);
        }
	
        @Override
	public List<Trainer> findAllTrainers() {
		return dao.findAllTrainers();
	}
	
}
