package com.comentReply.selfMapping.service;

import com.comentReply.selfMapping.entity.Comment;
import com.comentReply.selfMapping.repository.CommentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepo commentRepo;

    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    public Comment addComment(Comment comment){
        return commentRepo.save(comment);
    }

    public List<Comment> getAllComments(){
        return commentRepo.findAll();
    }
}
