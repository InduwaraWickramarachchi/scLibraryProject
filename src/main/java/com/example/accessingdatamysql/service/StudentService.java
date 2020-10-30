package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.Student;

public interface StudentService {

    void createStudent(Student student);

    void deleteStudent(Student student);
}
