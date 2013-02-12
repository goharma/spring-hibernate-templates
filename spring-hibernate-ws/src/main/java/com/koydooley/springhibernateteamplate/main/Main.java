package com.koydooley.springhibernateteamplate.main;

import javax.annotation.Resource;

import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.dao.BodyDao;
import com.koydooley.springhibernateteamplate.one_to_one.shared_primary_keys.domain.Body;

public class Main {
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	
	/**
	 * @param args
	 */
	@Transactional
	public static void main(String[] args) {
		Main myMain = new Main();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();

		BodyDao bodyDao = ctx.getBean("bodyDao", BodyDao.class);
		
		Body body = new Body();
		body.setName("sadf");
		
		bodyDao.save(body);
	}

}
