package com.g3.person_api.CommentTest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    List<Comment> get(){
        System.out.println(commentRepository.get());
        return commentRepository.get();
    }
}
