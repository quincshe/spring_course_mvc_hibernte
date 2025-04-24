package ru.didenko.spring.mvc_hibernate_aop.dao;

import java.util.List;
import ru.didenko.spring.mvc_hibernate_aop.entity.Employee;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
