package ru.didenko.spring.mvc_hibernate_aop.service;

import java.util.List;
import javax.validation.Valid;
import ru.didenko.spring.mvc_hibernate_aop.entity.Employee;


public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
