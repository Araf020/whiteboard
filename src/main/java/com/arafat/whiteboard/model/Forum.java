package com.arafat.whiteboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long forum_id;

    @Column(name = "forum_title")
    private String forum_title;

    @Column(name = "start_time")
    private Date start_time;

    @Column(name = "total_replies")
    private int total_replies;



    public Forum(String forum_title, Date start_time, int total_replies) {
        this.forum_title = forum_title;
        this.start_time = start_time;
        this.total_replies = total_replies;
    }

    public  Forum(){}

    public long getForum_id() {
        return forum_id;
    }

    public Forum setForum_id(long forum_id) {
        this.forum_id = forum_id;
        return this;
    }

    public String getForum_title() {
        return forum_title;
    }

    public Forum setForum_title(String forum_title) {
        this.forum_title = forum_title;
        return this;
    }

    public Date getStart_time() {
        return start_time;
    }

    public Forum setStart_time(Date start_time) {
        this.start_time = start_time;
        return this;
    }

    public int getTotal_replies() {
        return total_replies;
    }

    public Forum setTotal_replies(int total_replies) {
        this.total_replies = total_replies;
        return this;
    }


}
