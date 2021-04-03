package com.ltts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ltts.model.Employee;
 



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
