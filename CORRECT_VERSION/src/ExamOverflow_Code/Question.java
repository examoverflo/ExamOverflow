/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamOverflow_Code;

import java.util.ArrayList;
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
    private Student questionAsker;
    Module module;
    private List<Answer> allAnswers;

    public Question(int questionId, String questionText, String tNumber, String userPassword,Module module) {
        this.questionId = questionId;
        setQuestionText(questionText);
        this.questionAsker = new Student(tNumber, userPassword);
        this.module = module;
        allAnswers = new LinkedList<>();
    }

    public int getQuestionId(){ return questionId; }

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
                   "\nQuestion:" + getQuestionText() +
                    getStudent().toString();

                    // + "\nAnswers: " + printAnswers();
        }
        else
            return "\nQuestion ID:" + getQuestionId() +
                        "\nQuestion:" + getQuestionText() +
                        getStudent().toString();
    }

    public void setAnswer(Answer ans){
        this.allAnswers.add(ans);
    }

    public List<Answer> getAllAnswers(){
        return this.allAnswers;
    }

    public String printAnswers(){
        String print = "";
        for(Answer a : allAnswers){
            print += a.toString() + "\n";
        }
        return print;
    }

    void filterQuestionAnswersByTNumber(String tNumber, List<Answer> matchingAnswers) {
        for(Answer ans: getAllAnswers()){
            if(ans.getAnswerPoster().getTNumber().equals(tNumber)){
                matchingAnswers.add(ans);
            }

        }
    }

    public Module getModule(){
        return module;
    }
}
