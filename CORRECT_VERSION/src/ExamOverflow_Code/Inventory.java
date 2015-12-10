package ExamOverflow_Code;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 05/12/2015.
 */
public class Inventory {

    private List<Question> questions;
    private List<Answer> answers;


    public Inventory(){
        questions = new LinkedList<Question>();
        answers = new LinkedList<Answer>();
    }

    public void addQuestion(String questionText, Date datePosted, int questionId,String tNumber,String userPassword){

        Question question = new Question(questionText,datePosted,questionId,tNumber,userPassword);

        questions.add(question);
    }

    public void addAnswer(String answerText, int questionId, Date datePosted, int questionID,String tNumber,String userPassword){

        Answer answer = new Answer(answerText,datePosted,questionId,tNumber,userPassword);
        answers.add(answer);
    }

    public List<Answer> search(int questionID) {

        List<Answer> matchingAnswers = new LinkedList<Answer>();
        for (Answer answer : answers) {
            if (answer.getQuestionID() == questionID)
                matchingAnswers.add(answer);
        }
        return matchingAnswers;
    }



}
