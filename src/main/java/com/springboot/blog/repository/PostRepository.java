package com.springboot.blog.repository;


import com.springboot.blog.controller.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
