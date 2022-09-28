package com.example.service;

import com.example.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Optional;

public interface ICommentService {
    Page<Comment> findCommentByDate(LocalDate date, Pageable pageable);

    Iterable<Comment> findCommentByDate(LocalDate date);

    Iterable<Comment> findAll();

    Optional<Comment> findById(Long id);

    void save(Comment t);

    void remove(Long id);


}
