package com.example.accessingdatamysql.repository;


import com.example.accessingdatamysql.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    @Query(value = "SELECT * FROM student_details"
            + "WHERE grade = :grade", nativeQuery = true)
    List<Student> findStudents(@Param("grade") Integer grade);
}
