package com.learnspring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.learnspring.mvc.model.Developer;

public class DeveloperDao {
	
	private SessionFactory sessionFactory; 
	
	public List<Developer> getDevelopers() {
		Session session = sessionFactory.getCurrentSession();
		List<Developer> developers = session.createQuery("from developers", Developer.class).list();
	}

}
