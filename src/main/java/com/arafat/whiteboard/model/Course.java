package com.arafat.whiteboard.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {


    //set auto-increment to true
    //set a initial value of 101
    //set allocation size to 1
    //set increment by 1
    //set initial value of 101
    @Id
    @SequenceGenerator(name = "course_id_seq", sequenceName = "course_id_seq", allocationSize = 1, initialValue = 101)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "course_id_seq")

    private long course_id;

    @Column(name = "course_code",unique = true)
    private String courseCode;

    @Column(name = "course_title", unique = true)
    private String courseTitle;

    @Column(name = "credit_hour")
    private double creditHour;

    @Column (name = "course_description")
    private String courseDescription;

    @Column (name = "course_marks")
    private Double courseMarks;

    @Column (name = "course_grade")
    private String courseGrade;
    @Column (name = "course_prerequisite")
    private String coursePrerequisite;

    public Course(){}

    public Course(String course_code, String courseTitle, double creditHour) {
        this.courseCode = course_code;
        this.courseTitle = courseTitle;
        this.creditHour = creditHour;
    }

    public long getCourse_id() {
        return course_id;
    }



    public String getCourseId() {
        return courseCode;
    }

    public Course setCourseId(String courseCode) {
        this.courseCode = Course.this.courseCode;
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



    public String getCourseDescription() {
        return courseDescription;
    }

    public Course setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
        return this;
    }

    public Double getCourseMarks() {
        return courseMarks;
    }

    public Course setCourseMarks(Double courseMarks) {
        this.courseMarks = courseMarks;
        return this;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public Course setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
        return this;
    }

    public String getCoursePrerequisite() {
        return coursePrerequisite;
    }

    public Course setCoursePrerequisite(String coursePrerequisite) {
        this.coursePrerequisite = coursePrerequisite;
        return this;
    }
}

