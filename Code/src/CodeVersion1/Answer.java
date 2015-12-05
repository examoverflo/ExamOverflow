package CodeVersion1;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private String Tnumber;
    private String answerText;
    private int id;
    private Date datePosted;
    private int questionID;

    public Answer(){}

    public Answer(String tnumber, String answerText, int id, Date datePosted, int questionID) {
        Tnumber = tnumber;
        this.answerText = answerText;
        this.id = id;
        this.datePosted = datePosted;
        this.questionID = questionID;
    }

    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String tnumber) {
        Tnumber = tnumber;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                " \n\nTnumber='" + Tnumber + '\'' +
                ", answerText='" + answerText + '\'' +
                ", id=" + id +
                ", datePosted=" + datePosted +
                ", questionID=" + questionID;
    }
}
