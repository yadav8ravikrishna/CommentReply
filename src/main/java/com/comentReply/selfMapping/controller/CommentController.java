package com.comentReply.selfMapping.controller;

import com.comentReply.selfMapping.entity.Comment;
import com.comentReply.selfMapping.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }
    @PostMapping("/add")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }
}
