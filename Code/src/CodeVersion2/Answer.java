package CodeVersion2;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private int answerId;
    private String answerText;
    private String tNumber;
    private Date datePosted;
    private int questionID;

    public Answer(String tNumber, String answerText, int answerId, Date datePosted, int questionID) {
        this.tNumber = tNumber;
        this.answerText = answerText;
        this.answerId = answerId;
        this.datePosted = datePosted;
        this.questionID = questionID;
    }

    public String gettNumber() {
        return tNumber;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getAnswerId() {
        return answerId;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public int getQuestionID() {
        return questionID;
    }

    @Override
    public String toString() {
        return
                "\nPosted By:" + gettNumber() +
                "\nAnswer: " + getAnswerText() +
                "\nAnswer ID: " + getAnswerId() +
                "\nDate Posted: " + getDatePosted() +
                "\nAnswers: question" + getQuestionID();
    }
}
