package com.arafat.whiteboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long post_id;

    @Column(name = "comment")
    private String  comment;

    @Column(name = "timestamp")
    private Date timeStamp;


    public Post(){}
    public Post(String comment, Date timeStamp) {
        this.comment = comment;
        this.timeStamp = timeStamp;
    }

    public long getPost_id() {
        return post_id;
    }



    public String getComment() {
        return comment;
    }

    public Post setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Post setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
}
