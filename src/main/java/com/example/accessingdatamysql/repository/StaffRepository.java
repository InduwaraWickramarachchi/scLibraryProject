package com.example.accessingdatamysql.repository;

import com.example.accessingdatamysql.entity.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
}
