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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;
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
@Table(name="QUIZ")
@Entity
public class Quiz implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;
    
    @Column(name="QUIZ_NAME", nullable = false)
    @Size(min = 1, max = 120)
    private String quizName;
    
    @OneToMany(mappedBy = "quiz")
    @Column(name="QUESTION_SET")
    private Set<Question> questionSet;
    
    @Column(name="QUESTION_COUNT")
    private Integer question_count;
}
