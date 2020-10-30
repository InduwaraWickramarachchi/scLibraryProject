package com.example.accessingdatamysql.repository;


import com.example.accessingdatamysql.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
