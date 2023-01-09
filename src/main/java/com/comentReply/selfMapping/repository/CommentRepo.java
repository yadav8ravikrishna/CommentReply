package com.comentReply.selfMapping.repository;

import com.comentReply.selfMapping.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Long> {

}
