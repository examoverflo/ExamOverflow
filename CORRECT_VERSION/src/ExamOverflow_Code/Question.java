/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamOverflow_Code;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gerard
 */
public abstract class Question {

    private final int questionId;
    private String questionText;
    private final Student questionAsker;
    final Module module;
    private final List<Answer> allAnswers;

    public Question(int questionId, String questionText, Student student,Module module) {
        this.questionId = questionId;
        setQuestionText(questionText);
        this.questionAsker = student;
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
            return  "\nQuestion ID:" + getQuestionId() +
                    "\nQuestion:" + getQuestionText() +
                    "\n" +  getStudent().toString() +
                    "\nModule: " + getModule().toString();
    }

    public void setAnswer(Answer ans){
        this.allAnswers.add(ans);
    }

    public List<Answer> getAllAnswers(){
        return this.allAnswers;
    }

    public String printAnswers(){
        String print = "";
        if(getAllAnswers()==null){
            print = "There are no answers";
        }
        else {
            for (Answer a : allAnswers) {
                print += a.toString() + "\n";
            }
        }
        return print;
    }

    List<Answer> filterQuestionAnswersByTNumber(String tNumber) {
        List<Answer> matchingAnswers = new LinkedList<>();
        for(Answer ans: getAllAnswers()){
            if(ans.getAnswerPoster().getTNumber().equals(tNumber)){
                matchingAnswers.add(ans);
            }
        }
        return matchingAnswers;
    }

    public Module getModule(){
        return module;
    }
}
