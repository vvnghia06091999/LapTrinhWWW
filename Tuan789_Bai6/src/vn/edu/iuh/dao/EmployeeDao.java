package vn.edu.iuh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.beans.Employee;

@Repository
public class EmployeeDao {
	//@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee employee) {
		String sql = "insert Employee(NAME,SALARY,DESIGNATION) values('" + employee.getName() + "','"
				+ employee.getSalary() + "','" + employee.getDesignation() + "')";
		return template.update(sql);
	}

	public List<Employee> getAllEmployee() {
		return template.query("select * from Employee", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
