/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.services;

import com.tan.prashana.dao.Question;
import com.tan.prashana.dao.Quiz;
import com.tan.prashana.model.QuestionModel;
import com.tan.prashana.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tanish
 */
@Service
public class QuestionService {
    
    @Autowired private QuestionRepository questionRepository;
    
    public Question createQuestion(Quiz quiz, QuestionModel questionModel){
        Question ques = new Question();
        ques.setQuiz(quiz);
        ques.setQuestionDesc(questionModel.getQuestionDesc());
        ques.setCorrectAnswer(questionModel.getCorrectAnswer());
        questionRepository.save(ques);
        quiz.getQuestionSet().add(ques);
        return ques;
    }
}
