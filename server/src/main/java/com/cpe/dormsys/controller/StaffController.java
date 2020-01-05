package com.cpe.dormsys.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.cpe.dormsys.entity.Staff;
import com.cpe.dormsys.repository.StaffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class StaffController {

    @Autowired //เป็นการ connect ไปยัง database ซึ่งในที่นี้เราไม่ต้องเขียน connection database เอง
    private StaffRepository staffRepository;

    @GetMapping("/staffs")
    public Collection<Staff> getStaffs() {
        return staffRepository.findAll().stream().collect(Collectors.toList());
    }
}