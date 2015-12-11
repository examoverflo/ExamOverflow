/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamOverflow_Code;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gerard
 */
public class Question {

    private int questionId;
    private String questionText;
    private Date datePosted = new Date();
    private Student questionAsker;
    private List<Answer> allAnswers;

    public Question(int questionId, String questionText, Date datePosted, String tNumber, String userPassword) {
        this.questionId = questionId;
        setQuestionText(questionText);
        this.datePosted = datePosted;
        this.questionAsker = new Student(tNumber, userPassword);
        this.allAnswers = new LinkedList<>();
    }

    public int getQuestionId(){ return questionId; }

    public Date getDatePosted() {
        return datePosted;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Student getStudent(){
        return questionAsker;
    }

    @Override
    public String toString() {
        if (allAnswers != null){
            return "\nQuestion ID:" + getQuestionId() +
                    "\nDate Posted:" + getDatePosted() +
                    "\nQuestion:" + getQuestionText() +
                    "\nPosted By: " + getStudent().toString() +
                    "\nAnswers: " + printAnswers();
        }
        else
            return "\nQuestion ID:" + getQuestionId() +
                        "\nDate Posted:" + getDatePosted() +
                        "\nQuestion:" + getQuestionText() +
                        "\nPosted By: " + getStudent().toString();
    }

    public void setAnswer(Answer ans){
        this.allAnswers.add(ans);
    }

    public List<Answer> getAnswer(){
        return allAnswers;
    }

    public String printAnswers(){
        String print = "";
        for(Answer a : allAnswers){
            print += a.toString() + "\n";
        }
        return print;
    }
}
