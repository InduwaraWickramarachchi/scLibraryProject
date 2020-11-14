package com.example.accessingdatamysql.controllers;

import antlr.TokenStreamRewriteEngine;
import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/student")
    public void saveStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }

    @DeleteMapping(value = "/student/{Id}")
    public void deleteStudent(@PathVariable(name = "Id") Integer id) {
        studentService.deleteStudent(id);
    }

    @GetMapping(value = "/student/{grade}")
    public List<Student> findStudent(@PathVariable(name = "grade") String grade) {
        String newGrade = grade.replace('_', ' ');
        return studentService.findStudents(newGrade);

    }

    @PutMapping(value = "/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @PutMapping(value = "/student/{student_id}")
    public Student updateNumber(@PathVariable(name = "student_id") Integer studentId,
                                @RequestParam(name = "contact_number") Integer contactNumber) {

        return studentService.updateNumber(studentId, contactNumber);
    }

}

