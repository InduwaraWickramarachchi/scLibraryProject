package com.example.accessingdatamysql.service.impl;

import com.example.accessingdatamysql.entity.Staff;
import com.example.accessingdatamysql.repository.StaffRepository;
import com.example.accessingdatamysql.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffRepository staffRepo;

    public void createStaff(Staff staff){staffRepo.save(staff);}
}
