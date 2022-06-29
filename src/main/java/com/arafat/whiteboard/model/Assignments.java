package com.arafat.whiteboard.model;

import javax.persistence.*;

@Entity
@Table(name = "assignments")
public class Assignments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long assignment_id;

    @Column(name = "ass_title")
    private String ass_title;

    @Column(name = "submission_link")
    private String submission_link;

    @Column(name = "spec")
    private String spec;

    @Column(name = "description")
    private String description;

    public Assignments() {
    }

    public Assignments(String ass_title, String submission_link, String spec, String description) {
        this.ass_title = ass_title;
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
        return ass_title;
    }

    public Assignments setAss_title(String ass_title) {
        this.ass_title = ass_title;
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

}
