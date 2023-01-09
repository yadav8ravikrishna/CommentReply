package com.comentReply.selfMapping.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String commentBody;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Comment> replies;
}
