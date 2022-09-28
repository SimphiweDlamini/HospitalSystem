package com.demo.repository;

import com.demo.model.Doctor;
import com.demo.model.Employee;
import com.demo.model.Nurse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
