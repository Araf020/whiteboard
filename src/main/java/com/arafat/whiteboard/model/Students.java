package com.arafat.whiteboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long student_id;

    @Column(name = "roll")
    private int roll;

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

    @Column(name = "level_no")
    private int level;

    @Column(name = "term")
    private int term;

    @Column(name = "session")
    private String session;

    @Column(name = "cgpa")
    private double cgpa;



    @Column(name = "is_regular")
    private boolean is_regular;



    public Students(){

    }

    public Students(String name, String email, Date dateOfBirth, String address, String photo_url) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.photo_url = photo_url;
    }

    public Students(int roll ,String name, String email, Date dateOfBirth, String address, String photo_url, int level, int term, double cgpa, boolean is_regular) {

        this.roll = roll;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.photo_url = photo_url;
        this.level = level;
        this.term = term;
        this.cgpa = cgpa;
        this.is_regular = is_regular;
    }



    public long get_id() {
        return student_id;
    }

    public int getRoll() {
        return roll;
    }

    public Students setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public String getName() {
        return name;
    }

    public Students setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Students setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Students setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Students setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public Students setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Students setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getTerm() {
        return term;
    }

    public Students setTerm(int term) {
        this.term = term;
        return this;
    }

    public double getCgpa() {
        return cgpa;
    }

    public Students setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }

    public String getSession() {
        return session;
    }

    public Students setSession(String session) {
        this.session = session;
        return this;
    }

    public boolean isIs_regular() {
        return is_regular;
    }

    public Students setIs_regular(boolean is_regular) {
        this.is_regular = is_regular;
        return this;
    }
}
