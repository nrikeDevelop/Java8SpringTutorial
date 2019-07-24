package com.gfttraining.data_access_example.Springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.gfttraining.data_access_example.entity.Person;

@Component
public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

		Person person = new Person(rs.getInt("id"), rs.getString("name"), rs.getString("location"),
				rs.getTimestamp("birth_date"));

		return person;
	}

}
