package com.skbr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

	private JdbcTemplate jdbcTemplate;

	@Inject
	public void setDatasource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int countPersons() {
		return jdbcTemplate.queryForObject("select count(1) from person", Integer.class);
	}

	public Person findByName(String name) {
		return jdbcTemplate.queryForObject("select * from person where name = ?", 
				new Object[] {name},
				new RowMapper<Person>() {

					@Override
					public Person mapRow(ResultSet arg0, int arg1) throws SQLException {
						return new Person(arg0.getString("name"), arg0.getInt("age"));
					}
				});
	}
	
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person",
				new RowMapper<Person>() {

					@Override
					public Person mapRow(ResultSet arg0, int arg1) throws SQLException {
						return new Person(arg0.getString("name"), arg0.getInt("age"));
					}
				});
	}
	
}