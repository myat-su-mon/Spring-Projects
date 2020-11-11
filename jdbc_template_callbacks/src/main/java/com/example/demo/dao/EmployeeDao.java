package com.example.demo.dao;

import com.example.demo.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public static Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Employee(
                resultSet.getInt("employee_id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("email"),
                resultSet.getString("phone_number"),
                resultSet.getDate("hire_date"),
                resultSet.getInt("salary")
        );
    }

    @Autowired
    public void setDatasource(DataSource datasource){
        jdbcTemplate = new JdbcTemplate(datasource);
    }

    public List<Employee> findEmployees(){
        return jdbcTemplate.query(
                "select employee_id, first_name, last_name, email, phone_number, hire_date, salary from employee",
               EmployeeDao::mapRow
        );
    }

    public float findAverageSalaryByRow(){
        AverageSalaryRowCallbackHandler averageSalaryRowCallbackHandler = new AverageSalaryRowCallbackHandler();
        jdbcTemplate.query("select salary from employee", averageSalaryRowCallbackHandler);
        return averageSalaryRowCallbackHandler.getAverageSalary();
    }

    public static class AverageSalaryRowCallbackHandler implements RowCallbackHandler {

        private float salarySum = 0;
        private int salariesCount = 0;

        @Override
        public void processRow(ResultSet resultSet) throws SQLException {
            salarySum += resultSet.getFloat("salary");
            ++salariesCount;
        }

        public float getAverageSalary(){
            return salarySum/(float)salariesCount;
        }
    }

    private static class AverageSalaryResultSetExtractor implements ResultSetExtractor<Float> {

        @Override
        public Float extractData(ResultSet resultSet) throws SQLException, DataAccessException {
            float salarySum = 0;
            int salariesCount = 0;
            while (resultSet.next()){
                salarySum = resultSet.getFloat("salary");
                ++salariesCount;
            }
            return salarySum/(float)salariesCount;
        }
    }

    public float findAverageSalaryCalculatedOnEntireResultSet(){
        return jdbcTemplate.query("select salary from employee", new AverageSalaryResultSetExtractor());
    }

    public double findAverageSalaryModernImplementation(){
        return jdbcTemplate.queryForList("select salary from employee", Double.class)
                .stream().mapToDouble(Double::valueOf).average().orElse(0F);
    }

    public double findAverageSalarySqlLevel(){
        return jdbcTemplate.queryForObject(
                "select avg(salary) from employee", Double.class);
    }

    public int findEmployeeIdFromEmail(String email){
        return jdbcTemplate.query(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        return connection.prepareStatement("select employee_id from employee where email=?");
                    }
                },
                new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, email);
                    }
                },
                new ResultSetExtractor<Integer>() {

                    @Override
                    public Integer extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        if(resultSet.next()){
                            return resultSet.getInt("employee_id");
                        }else {
                            throw new SQLException("Unable to find id based on email.");
                        }
                    }
                }
        );
    }

}
