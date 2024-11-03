package com.learnspring.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.learnspring.mvc.model.Developer;

@Component
public class DeveloperDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Developer> getDevelopers() {

		Session session = sessionFactory.getCurrentSession();
		List<Developer> developers = session.createQuery("FROM developers", Developer.class).list();
		return developers;

	}

}
