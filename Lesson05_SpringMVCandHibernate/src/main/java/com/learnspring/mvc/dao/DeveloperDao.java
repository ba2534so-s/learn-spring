package com.learnspring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.learnspring.mvc.model.Developer;

public class DeveloperDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Developer> getDevelopers() {
		
		Session session = sessionFactory.getCurrentSession();
		List<Developer> developers = session.createQuery("FROM Developers", Developer.class).list(); 
		return developers;
		
	}

}
