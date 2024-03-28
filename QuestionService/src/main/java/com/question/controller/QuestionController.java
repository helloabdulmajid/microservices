package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService)
    {
        this.questionService=questionService;
    }

    //create
    @PostMapping
    public Question add(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    //get all

    @GetMapping
    public List<Question> get()
    {
        return questionService.get();
    }

    //get One Question by id

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id)
    {
        return  questionService.getOne(id);
    }

    //get Question by Quiz

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionByQuiz(@PathVariable Long quizId)
    {
        return  questionService.getQuestionOfQuiz(quizId);
    }
}
