package com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.dao.hibernate;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.dao.BodyDao;
import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.domain.Body;

@Repository("bodyDao")
@Transactional
public class BodyDaoImpl implements BodyDao {

	private SessionFactory sessionFactory;

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	

	
	public Body save(Body body) {
		sessionFactory.getCurrentSession().saveOrUpdate(body);
		
		return body;
	}

}
