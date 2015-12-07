/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVersion2;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Date;

/**
 *
 * @author Gerard
 */
public abstract class Question {

    private int questionId;
    private String tNumber;
    private String questionText;
    private Module module;

    public Question(String tNumber, String questionText, int questionId, Module module) {
        this.tNumber = tNumber;
        this.questionText = questionText;
        this.questionId = questionId;
        this.module = module;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getTNumber() {
        return tNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Module getModule() {
        return module;
    }

    @Override
    public String toString() {
        return
                "\nQuestion Id:" + getQuestionId() +
                "\ntNumber:" + getTNumber() +
                "\nModule: " + getModule() +
                "\nQuestion Text:" + getQuestionText();

    }
}
