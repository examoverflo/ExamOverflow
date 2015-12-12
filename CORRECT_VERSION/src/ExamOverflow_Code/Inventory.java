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
        questions = new LinkedList<>();

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
        getQuestionsPostedByTNumber(tNumber, matchingQuestionsByTNumber);
        return matchingQuestionsByTNumber;
    }

    private void getQuestionsPostedByTNumber(String tNumber, List<Question> matchingQuestionsByTNumber) {
        for (Question question : questions) {
            if (question.getStudent().getTNumber().equals(tNumber))
                matchingQuestionsByTNumber.add(question);
        }
    }

    //search for answers posted by certain T-Number
    public List<Answer> searchForAnswersByTNumber(String tNumber) {

        List<Answer> matchingAnswers = new LinkedList<>();

        for (Question question : questions) {//search each question

            //search each answer in the question
            question.filterQuestionAnswersByTNumber(tNumber, matchingAnswers);
            return matchingAnswers;

        }
        return matchingAnswers;
    }

    public List<Question> getQuestionsByModule(Module module){

        List<Question> matchingQuestions = new LinkedList<>();

        for(Question question: questions){
            if(question.getModule() == module)
            {
                matchingQuestions.add(question);
            }
        }
        return matchingQuestions;
    }

    public List<Question> getAllExamQuestions(){
        List<Question> allExamQuestions = new LinkedList();
        String questionType;
        for(Question question:questions){
            questionType = question.getClass().getSimpleName();
            if(questionType.equals("ExamQuestion")){
                allExamQuestions.add(question);
            }
        }
        return allExamQuestions;
    }


}
