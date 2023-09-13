/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.dao;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author tanish
 */
@Getter
@Setter
@NoArgsConstructor
@Table(name="QUESTION")
@Entity
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    
    @Column(name="QUESTION_DESC", nullable=false)
    @Size(min = 1, max = 420)
    private String questionDesc;
    
    @ManyToMany
    @JoinTable(
            name = "QUES_ANS",
            joinColumns = @JoinColumn(name = "QUESTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "ANSWER_ID")
    )
    private Set<Answer> options;
    
    @OneToOne()
    @JoinColumn(name = "CORRECT_ANSWER", nullable = false)
    private Answer correctAnswer;
    
    @OneToOne
    @JoinColumn(name = "QUIZ_ID", nullable = false)
    private Quiz quiz;
    
    @Column(name="SCORE")
    private Integer score;
    
    @Column(name="OPTION_COUNT")
    private Integer optionCount;
}
