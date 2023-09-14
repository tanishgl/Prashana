/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.services;

import com.tan.prashana.dao.Answer;
import com.tan.prashana.dao.Question;
import com.tan.prashana.dao.Quiz;
import com.tan.prashana.model.QuestionModel;
import com.tan.prashana.repository.AnswerRepository;
import com.tan.prashana.repository.QuestionRepository;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tanish
 */
@Service
public class QuestionService {
    
    @Autowired private QuestionRepository questionRepository;
    @Autowired private AnswerRepository answerRepository;
    @Autowired private AnswerService answerService;
    
    public Question createQuestion(Quiz quiz, QuestionModel questionModel){
        Question ques = new Question();
        ques.setQuiz(quiz);
        ques.setQuestionDesc(questionModel.getQuestionDesc());
        ques.setCorrectAnswer(questionModel.getCorrectAnswer());
        Set<String> options = questionModel.getOptions();
        Set<Answer> questionOptions = new HashSet<>();
        for(String answer : options){
            Answer option = answerService.createAnswer(answer);
            questionOptions.add(option);
        }
        questionRepository.save(ques);
        quiz.getQuestionSet().add(ques);
        return ques;
    }
}
