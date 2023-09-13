/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tan.prashana.repository;

import com.tan.prashana.dao.Answer;
import com.tan.prashana.dao.Question;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tanish
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    Set<Answer> findByQuestion(Question question);
    
    Answer findByQuestionAndIsCorrectTrue(Question question);
}
