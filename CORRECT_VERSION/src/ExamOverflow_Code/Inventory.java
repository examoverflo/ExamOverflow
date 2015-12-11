package ExamOverflow_Code;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 05/12/2015.
 */
public class Inventory {

    private List<Student> students;
    private List<Question> questions;
    private List<Answer> answers;


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

        //Answer answer = new Answer(a.getAnswerText(), a.getDateAnswered(),
          //      q.getQuestionId(),
            //    a.getAnswerPoster().getTNumber());
        for(Question q: questions){
            if(q.getQuestionId() == a.getQuestionId()){
                q.setAnswer(a);
            }
        }


    }

    //search for question by id
    public Question searchForQuestionByQuestionId(int questionId) {

        Question matchingQuestion;
        for (Question q : questions) {
            if (q.getQuestionId() == questionId)
                return matchingQuestion = q;
        }

        return null;
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

        for (Question question : questions) {
            List<Answer> speficQuestionAnswers = new LinkedList<>();
            for(Answer ans:question.getAllAnswers()){
                if(ans.getAnswerPoster().getTNumber().equals(tNumber)){
                    speficQuestionAnswers.add(ans);
                }
                matchingAnswers.addAll(speficQuestionAnswers);
            }
            return matchingAnswers;

        }
        return matchingAnswers;
    }


}
