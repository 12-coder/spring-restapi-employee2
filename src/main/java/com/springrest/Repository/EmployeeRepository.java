package com.springrest.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springrest.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{


}
