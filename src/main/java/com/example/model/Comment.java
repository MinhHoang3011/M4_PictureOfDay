package com.example.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String author;
    private int point;
    private String feedBack;
    private LocalDate date;
    private int likeOfComment;

    public Comment() {
    }

    public Comment(Long id, String author, int point, String feedBack, LocalDate date, int likeOfComment) {
        this.id = id;
        this.author = author;
        this.point = point;
        this.feedBack = feedBack;
        this.date = date;
        this.likeOfComment = likeOfComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLikeOfComment() {
        return likeOfComment;
    }

    public void setLikeOfComment(int likeOfComment) {
        this.likeOfComment = likeOfComment;
    }
}
