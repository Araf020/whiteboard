package com.arafat.whiteboard.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "assignments")
public class Assignments {


//    generate a sequence for the primary key
//    allocation size of 1
//    increment by 1
//    initial value of 100000
    @Id
    @SequenceGenerator(name = "assignment_id_seq", sequenceName = "assignment_id_seq", allocationSize = 1, initialValue = 100000)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "assignment_id_seq")

    private long assignment_id;

    @Column(name = "ass_title")
    private String assTitle;

    @Column(name = "submission_link")
    private String submission_link;

    @Column(name = "spec")
    private String spec;

    @Column(name = "description")
    private String description;


    @OneToMany(mappedBy = "assignment", cascade = CascadeType.ALL)
    private List<Submission> submissions;

//    establish a many to one relationship with the course  class
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Course course;


    public Assignments() {
    }

    public Assignments(String assTitle, String submission_link, String spec, String description) {
        this.assTitle = assTitle;
        this.submission_link = submission_link;
        this.spec = spec;
        this.description = description;
    }

    public long getAssignment_id() {
        return assignment_id;
    }

    public Assignments setAssignment_id(long assignment_id) {
        this.assignment_id = assignment_id;
        return this;
    }

    public String getAss_title() {
        return assTitle;
    }

    public Assignments setAss_title(String assTitle) {
        this.assTitle = assTitle;
        return this;
    }

    public String getSubmission_link() {
        return submission_link;
    }

    public Assignments setSubmission_link(String submission_link) {
        this.submission_link = submission_link;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public Assignments setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Assignments setDescription(String description) {
        this.description = description;
        return this;
    }
//    get courses
    public Course getCourse() {
        return course;
    }


}
