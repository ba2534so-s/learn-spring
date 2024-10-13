package com.learnspring.jdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learnspring.jdbc.model.Developer;


@Repository
public class DeveloperRepo {
	
	private JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void save(Developer developer) {
		
		String query = "INSERT INTO developers (developer_id, name, tech) VALUES (?, ?. ?)";
		int rows = template.update(query, developer.getId(), developer.getName(), developer.getTech());
		System.out.println(rows + " row/s affected");
		
	}
	
	public List<Developer> getAll() {
		String query = "SELECT * FROM developers";
		
		RowMapper<Developer> mapper = new RowMapper<Developer>() {

			@Override
			public Developer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Developer dev  = new Developer();
				dev.setId(rs.getInt(1));
				dev.setName(rs.getString(2));
				dev.setTech(rs.getString(3));
				
				return dev;
			}
			
		};
		
		List<Developer> developers = template.query(query, mapper);
		
		return developers;
	}

}
