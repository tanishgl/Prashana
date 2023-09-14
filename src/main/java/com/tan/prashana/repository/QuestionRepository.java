/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tan.prashana.repository;

import com.tan.prashana.dao.Question;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author tanish
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {
    
}
