package com.arafat.whiteboard.controller;

import com.arafat.whiteboard.model.Students;
import com.arafat.whiteboard.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/students")
    public ResponseEntity<List<Students>> getAllStudents(){
        List<Students> students = new ArrayList<>();

        studentRepo.findAll().forEach(students::add);
        

        if (students.isEmpty())
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(students, HttpStatus.OK);

    }


}
