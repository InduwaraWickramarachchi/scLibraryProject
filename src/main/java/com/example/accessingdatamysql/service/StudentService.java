package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    void createStudent(Student student);
}
