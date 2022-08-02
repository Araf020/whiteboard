package com.arafat.whiteboard.repository;


import com.arafat.whiteboard.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {

//    find the posts of a course
    List<Post> findByCourseCourseId(Long course_id);


}
