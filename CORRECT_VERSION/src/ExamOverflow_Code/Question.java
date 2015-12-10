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
    private String questionText;


    public Question(String questionText, Date datePosted, int questionId) {
        this.questionText = questionText;
        this.datePosted = datePosted;
        this.questionId = questionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public Date getDatePosted() {
        return datePosted;
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
                ", questionText='" + questionText + '\'';
    }
}
