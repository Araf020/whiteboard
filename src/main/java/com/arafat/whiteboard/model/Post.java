package com.arafat.whiteboard.model;

import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @SequenceGenerator(name = "postId_seq", sequenceName = "postId_seq", allocationSize = 1, initialValue = 600000)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "postId_seq")

    private long postId;

    @Column(name = "post_text")
    private String  postText;

    @Column(name = "post_title")
    private String postTitle;


    @Column(name = "timestamp")
    private Date createdAt;

// Many to one relationship with instructor
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "instructorId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Instructor instructor;


//    Many to one relationship with course
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Course course;


    public Post(){}
    public Post(String txt, Date createdAt) {
        this.postText = txt;
        this.createdAt = createdAt;
    }

    public long getpostId() {
        return postId;
    }



    public String getPostText() {
        return postText;
    }

    public Post setPostText(String postText) {
        this.postText = Post.this.postText;
        return this;
    }



    public Post setPostId(long postId) {
        this.postId = postId;
        return this;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public Post setPostTitle(String postTitle) {
        this.postTitle = postTitle;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Post setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Post setInstructor(Instructor instructor) {
        this.instructor = instructor;
        return this;
    }

    public Course getCourse() {
        return course;
    }

    public Post setCourse(Course course) {
        this.course = course;
        return this;
    }

}
