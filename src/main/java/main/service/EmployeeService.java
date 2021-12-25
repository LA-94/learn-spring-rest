package main.service;

import main.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    void save(Employee employee);

    Employee get(int id);

    void delete(int id);
}
