package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    //create

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);    // or getQuestionByQuizId
}
