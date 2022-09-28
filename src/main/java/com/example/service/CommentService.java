package com.example.service;

import com.example.model.Comment;
import com.example.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Page<Comment> findCommentByDate(LocalDate date, Pageable pageable) {
        return commentRepository.findCommentByDate(date,pageable);
    }

    @Override
    public Iterable<Comment> findCommentByDate(LocalDate date) {
        return commentRepository.findCommentByDate(date);
    }

    @Override
    public Iterable<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void save(Comment t) {
        commentRepository.save(t);
    }

    @Override
    public void remove(Long id) {
        commentRepository.deleteById(id);
    }
}
