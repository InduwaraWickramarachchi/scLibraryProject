package com.example.accessingdatamysql.repository;


import com.example.accessingdatamysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT * FROM student_details "
            + "WHERE grade = :grade", nativeQuery = true)
    List<Student> findStudents(@Param("grade") String grade);

    @Modifying
    @Query("UPDATE Student s SET s.contactNumber = :contactNumber WHERE s.studentId = :studentId")
    void updateNumber(@Param("studentId") Integer studentId, @Param("contactNumber") Integer number);
}


