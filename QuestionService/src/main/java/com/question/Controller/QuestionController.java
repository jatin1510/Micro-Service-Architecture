package com.question.Controller;

import com.question.Entity.Question;
import com.question.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // create
    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.add(question);
    }

    // get All
    @GetMapping
    public List<Question> getAll() {
        return questionService.get();
    }

    // get One
    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id) {
        return questionService.get(id);
    }

    // get All Question of a Particular Quiz
    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long id) {
        return questionService.getQuestionsOfQuiz(id);
    }
}
