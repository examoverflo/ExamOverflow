/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamOverflow_Code;

import java.util.Date;

/**
 *
 * @author Gerard
 */
public class Question {
    private int questionId;
    private Date datePosted = new Date();
    private String tNumber;
    private String questionText;

    public Question(){

    }

    public Question(String tNumber, String questionText, Date datePosted, int questionId) {
        this.tNumber = tNumber;
        this.questionText = questionText;
        this.datePosted = datePosted;
        this.questionId = questionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
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
                "questionId=" + questionId +
                ", datePosted=" + datePosted +
                ", tNumber='" + tNumber + '\'' +
                ", questionText='" + questionText + '\'';
    }
}
