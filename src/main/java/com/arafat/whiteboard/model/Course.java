package com.arafat.whiteboard.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long course_id;

    @Column(name = "session_id",unique = true)
    private String sessionId;

    @Column(name = "course_title")
    private String courseTitle;

    @Column(name = "credit_hour")
    private double creditHour;

    public Course(){}

    public Course(String sessionId, String courseTitle, double creditHour) {
        this.sessionId = sessionId;
        this.courseTitle = courseTitle;
        this.creditHour = creditHour;
    }

    public long getCourse_id() {
        return course_id;
    }



    public String getSessionId() {
        return sessionId;
    }

    public Course setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public Course setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
        return this;
    }

    public double getCreditHour() {
        return creditHour;
    }

    public Course setCreditHour(double creditHour) {
        this.creditHour = creditHour;
        return this;
    }
}

