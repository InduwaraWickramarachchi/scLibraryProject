package com.example.accessingdatamysql.controllers;

import com.example.accessingdatamysql.entity.Staff;
import com.example.accessingdatamysql.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StaffController {

    @Autowired
    StaffService staffService;

    @PostMapping(value = "/staff")
    public void saveStaff(@RequestBody Staff staff){
        staffService.createStaff(staff);
    }

}
