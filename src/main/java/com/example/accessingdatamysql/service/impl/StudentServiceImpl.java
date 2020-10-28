package com.example.accessingdatamysql.service.impl;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.repository.StudentRepository;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void createStudent(Student student) {
        studentRepository.save(student);
    }
}
