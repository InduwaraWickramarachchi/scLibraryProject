package com.example.accessingdatamysql.service.impl;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.repository.StudentRepository;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepo;

    public void createStudent(Student student) {
        studentRepo.save(student);
    }


    public void deleteStudent(Integer Id) {
        studentRepo.deleteById(Id);
    }


    public List<Student> findStudents(Integer grade) {

        return studentRepo.findStudents(grade);

    }

}
