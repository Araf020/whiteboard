package com.arafat.whiteboard.repository;

import com.arafat.whiteboard.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo  extends JpaRepository<Course, Long> {

    Course findCourseByCourseTitleEquals(String title);
    List<Course> findAllByCreditHour(double credit_hour);
}