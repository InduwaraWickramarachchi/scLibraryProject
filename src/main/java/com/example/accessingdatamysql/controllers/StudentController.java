package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/student")
    public void saveStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @DeleteMapping(value = "/student/{Id}")
    public void deleteStudent(@PathVariable (name = "Id") Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping(value = "/student{grade}")
    public List<Student> findStudent(@PathVariable (name = "grade")Integer grade){
         return studentService.findStudents(grade);
    }

}
