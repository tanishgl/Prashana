/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tan.prashana.dao.Answer;
import com.tan.prashana.model.AnswerModel;
import com.tan.prashana.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tanish
 */
@Service
public class AnswerService {
    
    @Autowired
    private AnswerRepository ansRepo;
    
    ObjectMapper mapper = new ObjectMapper();
    
    public Answer createAnswer(String answer){
        boolean doesAnswerAlreadyExist = ansRepo.existsByContent(answer);
        Answer newAnswer;
        if(!doesAnswerAlreadyExist){
            newAnswer = new Answer();
            newAnswer.setContent(answer);
            newAnswer = ansRepo.save(newAnswer);
        } else {
            newAnswer = ansRepo.findByContent(answer);
        }
        return newAnswer;
    }
}
