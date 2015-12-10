package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private String answerText;
    private Date datePosted;
    private int questionID;
    private Student answerPoster;

    public Answer(String answerText,Date datePosted, int questionID) {

        this.answerText = answerText;
        this.datePosted = datePosted;
        this.questionID = questionID;
    }



    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
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
                "\nAnswer: " + answerText +
                "\nDate Posted: " + datePosted +
                "\nAnswers: qiestion" + questionID;
    }
}
