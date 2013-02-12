package com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.domain.Body;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class BodyTest {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	@Transactional
	public void testSaveBodyWithHeart() {
		Session session = sessionFactory.getCurrentSession();
		Body body = new Body();
		
		session.save(body);
		session.flush();
		
	}
	
	
}
