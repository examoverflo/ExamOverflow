package CodeVersion1;

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

    public void addQuestion(String tNumber, String questionText, Date datePosted, int questionId){

        Question question = new Question(tNumber,questionText,datePosted,questionId);

        questions.add(question);
    }

    public void addAnswer(String tnumber, String answerText, int id, Date datePosted, int questionID){

        Answer answer = new Answer(tnumber,answerText,id,datePosted,questionID);
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
