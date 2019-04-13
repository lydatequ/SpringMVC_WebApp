package com.javabycode.springmvctrn.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javabycode.springmvctrn.model.Trainer;

@Repository("studentDao")
public class TrainerDaoImpl extends AbstractDao<Integer, Trainer> implements TrainerDao {

        @Override
	public Trainer findById(int id) {
		return getByKey(id);
	}

        @Override
	public void saveTrainer(Trainer trainer) {
		persist(trainer);
	}
	
	public void updateTrainer(Trainer trainer){
		super.saveOrUpdate(trainer);
	}
	
        @Override
	public void deleteTrainerById(int id) {
		Query query = getSession().createSQLQuery("delete from students where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
        @Override
	public List<Trainer> findAllTrainers() {
		Criteria criteria = createEntityCriteria();
		return (List<Trainer>) criteria.list();
	}

        @Override
	public Trainer editTrainerById(int id) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("id", id));
		return (Trainer) criteria.uniqueResult();
	}
}
