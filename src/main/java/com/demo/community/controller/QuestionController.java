package com.demo.community.controller;

import com.demo.community.dto.QuestionDTO;
import com.demo.community.exception.CustomizeException;
import com.demo.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(
            Model model,
            @PathVariable(name = "id")Integer id
    ){
        QuestionDTO question = questionService.getById(id);
        model.addAttribute("question", question);
        return "question";
    }
}
