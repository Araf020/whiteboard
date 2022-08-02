package com.arafat.whiteboard.controller;

import com.arafat.whiteboard.model.Assignments;
import com.arafat.whiteboard.repository.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AssignmentsController {

    @Autowired
    private AssignmentRepo assignmentRepo;

    @GetMapping("/assignments/{course_id}")
    public ResponseEntity<List<Assignments>> getAllAssignmentsByCourseId(@PathVariable("course_id") Long course_id) {

        List<Assignments> assignments = new ArrayList<>(assignmentRepo.findByCourseCourseId(course_id));

        if (assignments.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(assignments, HttpStatus.OK);

    }

//    @GetMapping("/assignments/{student_id}")
//    public ResponseEntity<List<Assignments>> getAllAssignmentsByStudentId(@PathVariable("student_id") Long student_id) {
//
//        List<Assignments> assignments = new ArrayList<>(assignmentRepo.findBySchoolStudent_id(student_id));
//
//        if (assignments.isEmpty())
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//        return new ResponseEntity<>(assignments, HttpStatus.OK);
//
//    }

//    create an assignment
    @PostMapping("/assignments")
    public ResponseEntity<Assignments> createAssignment(@RequestBody Assignments assignment) {
        assignmentRepo.save(assignment);
        return new ResponseEntity<>(assignment, HttpStatus.CREATED);
    }

//    update an assignment
//    @PutMapping("/assignments/{id}")
//    public ResponseEntity<Assignments> updateAssignment(@PathVariable("id") Long id, @RequestBody Assignments assignment) {
//        Optional<Assignments> assignmentData = assignmentRepo.findById(id);
//        if (assignmentData.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        Assignments assignment_2 = assignmentData.get();
//
//        assignment_2.setSpec(assignment.getSpec());
//
////        put to db
//        assignmentRepo.save(assignment_2);
//
//        return new ResponseEntity<>(assignment_2, HttpStatus.OK);
//
//
//
//
//    }

}
