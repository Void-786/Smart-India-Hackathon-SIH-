package com.hackathon.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Document
public class Post {

    @Id
    private String id;
    private String content;
    private String imageId;
    private String userId;
    private List<String> likedBy = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    private long createdAt;

    public Post() {
        this.createdAt = System.currentTimeMillis();
    }

    public Post(String content, String imageId, String userId) {
        this.content = content;
        this.imageId = imageId;
        this.userId = userId;
        this.createdAt = System.currentTimeMillis();
    }
}