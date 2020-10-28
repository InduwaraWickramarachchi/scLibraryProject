package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/students")
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }
}
