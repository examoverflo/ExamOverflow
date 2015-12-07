package CodeVersion1;

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

    public Answer(String tnumber, String answerText, int id, Date datePosted, int questionID) {
        this.tNumber = tnumber;
        this.answerText = answerText;
        this.answerId = id;
        this.datePosted = datePosted;
        this.questionID = questionID;
    }

    public String gettNumber() {
        return tNumber;
    }

    public void settNumber(String tNumber) {
        this.tNumber = tNumber;
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

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    @Override
    public String toString() {
        return
                " \nPosted By:'" + tNumber +
                "\nAnswer: " + answerText +
                "\nID: " + answerId +
                "\nDate Posted: " + datePosted +
                "\nAnswers: qiestion" + questionID;
    }
}
