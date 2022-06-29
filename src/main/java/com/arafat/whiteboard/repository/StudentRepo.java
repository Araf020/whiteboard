package com.arafat.whiteboard.repository;

import com.arafat.whiteboard.model.Students;
import com.arafat.whiteboard.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Students, Long> {

    List<Students> findByRoll(int roll);
    List<Students> findByLevelEqualsAndTermEquals(int level, int term);
    List<Students> findBySession(String session);
}
