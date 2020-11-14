package com.example.accessingdatamysql.service.impl;

import com.example.accessingdatamysql.entity.Student;
import com.example.accessingdatamysql.repository.StudentRepository;
import com.example.accessingdatamysql.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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


    public List<Student> findStudents(String grade) {

        return studentRepo.findStudents(grade);

    }

    public Student updateStudent(Student studentUpdate){
        Optional<Student> student = studentRepo.findById(studentUpdate.getStudentId());
        if (student.isPresent()){
            BeanUtils.copyProperties(studentUpdate, student.get());
            student.get().setStudentId(studentUpdate.getStudentId());
            student.get().setFirstName(studentUpdate.getFirstName());
            student.get().setMiddleName(studentUpdate.getMiddleName());
            student.get().setLastName(studentUpdate.getLastName());
            student.get().setGrade(studentUpdate.getGrade());
            student.get().setContactNumber(studentUpdate.getContactNumber());

            return studentRepo.save(student.get());
        }else{
            return null;
        }
    }

    @Transactional
    public Student updateNumber(Integer studentId, Integer contactNumber){
        studentRepo.updateNumber(studentId, contactNumber);
        return null;
    }

}
