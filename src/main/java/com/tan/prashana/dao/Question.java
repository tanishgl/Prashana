/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    
    @OneToOne()
    @JoinColumn(name = "CORR_ANS", referencedColumnName = "answerId")
    private Answer correctAnswer;
    
    @Column(name="SCORE")
    private Integer score;
    
    @Column(name="OPTION_COUNT")
    private Integer optionCount;
}
