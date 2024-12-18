package com.learnspring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learnspring.mvc.model.Developer;

import jakarta.transaction.Transactional;

@Component
public class DeveloperDao {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Transactional
	public List<Developer> getDevelopers() {
		Session session = sessionFactory.getCurrentSession();
		List<Developer> developers = session.createQuery("from Developer", Developer.class).list();
		return developers;
	}
	
	@Transactional
	public void addDeveloper(Developer d) {
		Session session = sessionFactory.getCurrentSession();
		session.save(d);
	}
	
	@Transactional
	public Developer getDeveloper(int developerId) {
		Session session = sessionFactory.getCurrentSession();
		Developer d = session.get(Developer.class, developerId);
		return d;
	}

}
