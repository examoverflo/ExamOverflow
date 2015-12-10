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

    public void addStudent(String tNumber, String userPassword){

        Student student = new Student(tNumber, userPassword);

        students.add(student);
    }

    public void addQuestion(String questionText, Date datePosted, String tNumber,String userPassword){

        Question question = new Question(questionText, datePosted, tNumber, userPassword);

        questions.add(question);
    }

    public void addAnswer(String answerText,Date dateAnswered,
                          String questionText, Date datePosted, String tNumberQuestioner, String passwordQuestioner,
                          String tNumberAnswerer, String passwordAnswerer){

        Answer answer = new Answer(answerText, dateAnswered,
                questionText, datePosted, tNumberQuestioner, passwordQuestioner,
                tNumberAnswerer, passwordAnswerer);
        answers.add(answer);
    }

    public List<Answer> searchForAnswers(String questionText) {
        //for each answer in answers return where question is matching
        List<Answer> matchingAnswers = new LinkedList<Answer>();
        for (Answer answer : answers) {
            if (answer.getQuestionText().equals(questionText))
                matchingAnswers.add(answer);
        }
        return matchingAnswers;
    }



}
