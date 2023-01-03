package com.springboot.blog.service.impl;

import com.springboot.blog.controller.entity.Comment;
import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.repository.CommentRepository;
import com.springboot.blog.service.CommentService;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDto createComment(Long postId, CommentDto commentDto) {
        return null;
    }

    private CommentDto mapToDTO(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setName(comment.getName());
        commentDto.setEmail(comment.getEmail);
        commentDto.setBody(comment.getBody());
        return commentDto;
    }
    
    private Comment mapToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setName(commentDto.getName());
        comment.setEmail(commentDto.getEmail());
        comment.setBody(commentDto.getBody());
        return comment
    }


}
