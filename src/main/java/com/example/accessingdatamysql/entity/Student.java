package com.example.accessingdatamysql.entity;

import com.example.accessingdatamysql.enums.GenderEnum;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_DETAILS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Integer studentId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "CONTACT_NUMBER")
    private Integer contactNumber;

    public Integer getStudentId(){
        return studentId;
    }

    public void setStudentId(Integer studentId){
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }
}
