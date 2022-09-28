package com.example.controller;

import com.example.model.Comment;
import com.example.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class PictureController {
    @Autowired
    private ICommentService commentService ;

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("/picture");
        modelAndView.addObject("comment",new Comment());
        modelAndView.addObject("listComment",commentService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createComment(@ModelAttribute("comment") Comment comment){
        comment.setDate(LocalDate.now());
        commentService.save(comment);
        ModelAndView modelAndView = new ModelAndView("/picture");
        modelAndView.addObject("listComment",commentService.findAll());
        return modelAndView;
    }

}
