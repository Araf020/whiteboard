package com.arafat.whiteboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "instructor")

public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long instructor_id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "photo_url")
    private String photo_url;

    @Column(name = "designation")
    private String designation;

    @Column(name = "salary")
    private double salary;

    @Column(name = "ofice_number")
    private int ofice_number;

    public Instructor(){}

    public Instructor(String name, String email, Date dateOfBirth, String address, String photo_url, String designation, double salary, int ofice_number) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.photo_url = photo_url;
        this.designation = designation;
        this.salary = salary;
        this.ofice_number = ofice_number;
    }

    public long getInstructor_id() {
        return instructor_id;
    }



    public String getName() {
        return name;
    }

    public Instructor setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Instructor setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Instructor setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Instructor setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public Instructor setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public Instructor setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Instructor setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public int getOfice_number() {
        return ofice_number;
    }

    public Instructor setOfice_number(int ofice_number) {
        this.ofice_number = ofice_number;
        return this;
    }
}

