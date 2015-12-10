/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamOverflow_Code;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Gerard
 */
public class Question {
    private int questionId;
    private Date datePosted = new Date();
    private String questionText;
    private Student questionAsker;
    private List<Answer> allAnswers;

    public Question(String questionText, Date datePosted, int questionId,String tNumber,String userPassword) {
        this.questionText = questionText;
        this.datePosted = datePosted;
        this.questionId = questionId;
        this.questionAsker = new Student(tNumber,userPassword);
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
                "\nQuestion ID:" + questionId +
                "\nDate Posted:" + datePosted +
                "\nQuestion:" + questionText +
                "\nPosted By: " + questionAsker.getTnumber();
    }
}
