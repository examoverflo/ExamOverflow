package CodeVersion2;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 05/12/2015.
 */
public class Inventory {

    private List<Question> questions;
    private List<Answer> answers;


    public Inventory() {
        questions = new LinkedList<Question>();
        answers = new LinkedList<Answer>();
    }

    static void searchForAnswers(Inventory inventory, int questionId) {
        List<Answer> questionAnswer = inventory.search(questionId);

        System.out.println("Searching for answer to...John's question....\n");

        if(!questionAnswer.isEmpty()) {
            System.out.println("................\n"
                             + "Here are all the answers:");
            for (Answer answer : questionAnswer) {
                System.out.println(answer.toString());
            }
        }
        else {
            System.out.println("Unfortunately, no answers have been given for this question");
        }
    }

    public void addGeneralQuestion(String tNumber, String questionText, int questionId,
                                   Date datePosted, Module module, Topic topic) {

        Question question = new GeneralQuestion(tNumber, questionText, questionId, datePosted, module, topic);

        questions.add(question);
    }

    public void addExamQuestion(String tNumber, String questionText, int questionId,
                                int examYear, int questionNo, Module module) {

        Question question = new ExamQuestion(examYear, questionNo, questionId, tNumber, questionText, module);

        questions.add(question);
    }

    public void addAnswer(String tNumber, String answerText, int answerID, Date datePosted, int questionID) {

        Answer answer = new Answer(tNumber, answerText, answerID, datePosted, questionID);
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
