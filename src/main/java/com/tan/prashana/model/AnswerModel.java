/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tan.prashana.model;

import java.io.Serializable;
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
public class AnswerModel implements Serializable{
    @NonNull private String answerValue;
}
