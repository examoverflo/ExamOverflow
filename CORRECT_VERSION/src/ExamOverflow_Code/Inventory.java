package ExamOverflow_Code;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 05/12/2015.
 */
public class Inventory {

    private List<Student> students;
    private List<Question> questions;

    public Inventory(){
        students = new LinkedList<>();
        questions = new LinkedList<Question>();

    }


    public void addStudent(Student s){
        students.add(s);
    }

    public void addQuestion(Question q){
        questions.add(q);
    }

    public void addAnswer(Answer a){

        for(Question q: questions){
            if(q.getQuestionId() == a.getQuestionId()){
                q.setAnswer(a);
            }
        }


    }

    //search for question by id
    public Question searchForQuestionByQuestionId(int questionId) {

        Question matchingQuestion =null;
        for (Question q : questions) {
            if (q.getQuestionId() == questionId)
                matchingQuestion = q;
        }

        return matchingQuestion;
    }

    //search for answers to certain question
    public List<Answer> searchForAnswersByQuestionId(int questionId) {

        List<Answer> matchingAnswers = new LinkedList<>();

        for(Question q : questions){
            if(q.getQuestionId() == questionId){
                matchingAnswers = q.getAllAnswers();
            }
        }
        return matchingAnswers;
    }

    //search for questions posted by certain T-Number
    public List<Question> searchWhoPostedQuestion(String tNumber) {

        List<Question> matchingQuestionsByTNumber = new LinkedList<>();
        for (Question question : questions) {
            if (question.getStudent().getTNumber().equals(tNumber))
                matchingQuestionsByTNumber.add(question);
        }
        return matchingQuestionsByTNumber;
    }

    //search for questions posted by certain T-Number
    public List<Answer> searchForAnswersByTNumber(String tNumber) {

        List<Answer> matchingAnswers = new LinkedList<>();

        if (searchQuestionForAnswersByTNumber(tNumber, matchingAnswers)) return matchingAnswers;
        return matchingAnswers;
    }

    private boolean searchQuestionForAnswersByTNumber(String tNumber, List<Answer> matchingAnswers) {
        for (Question question : questions) {
            List<Answer> speficQuestionAnswers = new LinkedList<>();
            for(Answer ans:question.getAllAnswers()){
                if(ans.getAnswerPoster().getTNumber().equals(tNumber)){
                    speficQuestionAnswers.add(ans);
                }
                matchingAnswers.addAll(speficQuestionAnswers);
            }
            return true;

        }
        return false;
    }


}
