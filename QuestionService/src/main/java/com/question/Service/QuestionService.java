package com.question.Service;

import com.question.Entity.Question;

import java.util.List;

public interface QuestionService {
    Question add(Question question);

    List<Question> get();

    Question get(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
