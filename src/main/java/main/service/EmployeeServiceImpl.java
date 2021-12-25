package main.service;

import main.dao.EmployeeDao;
import main.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public Employee get(int id) {
        return employeeDao.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDao.delete(id);
    }
}
