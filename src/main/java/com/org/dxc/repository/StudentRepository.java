package com.org.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{

}
