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
        answers = new LinkedList<Answer>();
    }

    public void addStudent(Student s){

        Student student = new Student(s.getTNumber(), s.getUserPassword());
        students.add(student);
    }

    public void addQuestion(Question q){

        Question question = new Question(q.getQuestionId(), q.getQuestionText(), q.getDatePosted(),
                                            q.getStudent().getTNumber(), q.getStudent().getUserPassword());
        questions.add(question);
    }

    public void addAnswer(Answer a, Question q){

        Answer answer = new Answer(a.getAnswerText(), a.getDateAnswered(),
                q.getQuestionId(),
                a.getAnswerPoster().getTNumber());
        answers.add(answer);
    }

    //search for question by id
    public List<Question> searchForQuestionByQuestionId(int questionId) {

        List<Question> matchingQuestions = new LinkedList<>();
        for (Question q : questions) {
            if (q.getQuestionId() == questionId)
                matchingQuestions.add(q);
        }
        return matchingQuestions;
    }

    //search for answers to certain question
    public List<Answer> searchForAnswersByQuestionId(int questionId) {

        List<Answer> matchingAnswers = new LinkedList<>();
        for (Answer answer : answers) {
            if (answer.getQuestionId() == questionId)
                matchingAnswers.add(answer);
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
        for (Answer answer : answers) {
            if (answer.getAnswerPoster().getTNumber().equals(tNumber))
                matchingAnswers.add(answer);
        }
        return matchingAnswers;
    }

}
