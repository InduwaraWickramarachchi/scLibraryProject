package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.Student;

import java.util.List;

public interface StudentService {

    void createStudent(Student student);

    void deleteStudent(Integer Id);

    List<Student> findStudents(String grade);

    Student updateStudent(Student studentUpdate);

    Student updateNumber(Integer studentId, Integer contactNumber);

}
