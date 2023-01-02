package com.springboot.blog.impl;


import com.springboot.blog.payload.PostDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

   List<PostDto> getAllPosts();
   PostDto getPostById(long id);
   PostDto updatePost(PostDto postDto, long id);


    ResponseEntity<PostDto> deletePostById(long id);
}
