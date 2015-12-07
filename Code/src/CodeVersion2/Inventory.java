package CodeVersion2;

import CodeVersion1.Answer;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 05/12/2015.
 */
public class Inventory {

    private List<GeneralQuestion> questions;
    private List<Answer> answers;


    public Inventory(){
        questions = new LinkedList<GeneralQuestion>();
        answers = new LinkedList<Answer>();
    }

    public void addQuestion(String tNumber, String questionText, int questionId, Date datePosted){

        GeneralQuestion question = new GeneralQuestion(tNumber,questionText,questionId,datePosted);

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
