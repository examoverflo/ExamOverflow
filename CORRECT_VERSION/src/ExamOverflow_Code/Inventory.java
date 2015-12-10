package ExamOverflow_Code;

import java.util.Date;
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
        Question question = new Question(q.getQuestionText(), q.getDatePosted(), q.getStudent().getTNumber(), q.getStudent().getUserPassword());
        questions.add(question);
    }

    public void addAnswer(Answer a, Question q){

        Answer answer = new Answer(a.getAnswerText(), a.getdateAnswered(),
                q.getQuestionText(), q.getDatePosted(), q.getStudent().getTNumber(), q.getStudent().getUserPassword(),
                a.getAnswerPoster().getTNumber(), a.getAnswerPoster().getUserPassword());
        answers.add(answer);
    }

    public List<Answer> searchForAnswers(String questionText) {
        //for each answer in answers return where question is matching
        List<Answer> matchingAnswers = new LinkedList<Answer>();
        for (Answer answer : answers) {
            if (answer.getQuestion().getQuestionText().equals(questionText))
                matchingAnswers.add(answer);
        }
        return matchingAnswers;
    }



}
