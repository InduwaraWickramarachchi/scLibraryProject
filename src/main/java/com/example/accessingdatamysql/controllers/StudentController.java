package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/student")
    public void saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @DeleteMapping(value = "/student")
    public void deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);}

}
