package com.springboot.blog.service.impl;


import com.springboot.blog.entity.Post;
import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
