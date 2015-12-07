/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeVersion2;

import java.util.Date;

/**
 *
 * @author Gerard
 */
public abstract class Question {
    private int questionId;
    private String tNumber;
    private String questionText;
    //need enum for module

    public Question(){

    }

    public Question(String tNumber, String questionText, int questionId) {
        this.tNumber = tNumber;
        this.questionText = questionText;
        this.questionId = questionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String gettNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public String toString() {
        return
                "\nQuestion Id:" + getQuestionId() +
                "\ntNumber:" + gettNumber() +
                "\nQuestion Text:" + getQuestionText();
    }
}
