package com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.dao;

import org.hibernate.SessionFactory;

import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.domain.Body;

public interface BodyDao {
	public SessionFactory getSessionFactory();
	public Body save(Body body);
}
