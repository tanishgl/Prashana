/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.model;

import com.tan.prashana.dao.Answer;
import java.util.Set;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author tanish
 */
@Getter
@Setter
@ToString
public class QuestionModel {
    @NonNull private Long quizId;
    @NonNull private String questionDesc;
    @NonNull private Set<Answer> options;
    @NonNull private Answer correctAnswer;
    private Integer score;
}
