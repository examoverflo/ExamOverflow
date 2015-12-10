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
    private Date datePosted = new Date();
    private String questionText;
    private Student questionAsker;
    private static List<Answer> allAnswers;

    public Question(String questionText, Date datePosted, String tNumber, String userPassword) {
        this.questionText = questionText;
        this.datePosted = datePosted;
        this.questionAsker = new Student(tNumber, userPassword);
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
                "\nDate Posted:" + datePosted +
                "\nQuestion:" + questionText +
                        "\nPosted By: " + questionAsker.toString();
    }

    public void addAnswer(Answer ans){
        allAnswers.add(ans);
    }
}
