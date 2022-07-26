package com.arafat.whiteboard.repository;

import com.arafat.whiteboard.model.AssignmentScore;
import com.arafat.whiteboard.model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentScoreRepo extends JpaRepository<AssignmentScore, Long> {
//    find scores by assignmentId
    List<AssignmentScore> findByAssignment_id(Long assignment_id);
    List<AssignmentScore> findBySchoolStudent_id(Long student_id);


}
