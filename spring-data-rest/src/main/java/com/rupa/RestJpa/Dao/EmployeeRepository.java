package com.rupa.RestJpa.Dao;

import com.rupa.RestJpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="members")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
