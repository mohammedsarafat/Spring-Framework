package com.nit.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

	private final JdbcTemplate jdbcTemplate;

	public StudentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// Task 1
	public Integer getStudentCount() {

		String sql = "SELECT COUNT(*) FROM Student";

		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	// Task 2
	public String getStudentName(int studentId) {

		String sql = "SELECT StudentName " + "FROM Student " + "WHERE StudentId = ?";

		return jdbcTemplate.queryForObject(sql, String.class, studentId);
	}

	// Task 3
	public Double getStudentFees(int studentId) {

		String sql = "SELECT Fees " + "FROM Student " + "WHERE StudentId = ?";

		return jdbcTemplate.queryForObject(sql, Double.class, studentId);
	}
}
