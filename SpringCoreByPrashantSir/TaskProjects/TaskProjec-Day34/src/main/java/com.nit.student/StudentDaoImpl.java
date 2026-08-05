
package com.nit.student;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Integer getStudentCount() {

		String sql = "SELECT COUNT(*) FROM Student_Details";

		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public String getStudentNameById(Integer studentId) {

		String sql = "SELECT StudentName FROM Student_Details WHERE StudentId=?";

		return jdbcTemplate.queryForObject(sql, String.class, studentId);
	}

	@Override
	public Double getStudentFeesById(Integer studentId) {

		String sql = "SELECT Fees FROM Student_Details WHERE StudentId=?";

		return jdbcTemplate.queryForObject(sql, Double.class, studentId);
	}

}

