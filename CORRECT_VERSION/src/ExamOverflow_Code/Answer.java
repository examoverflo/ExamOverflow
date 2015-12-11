package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private String answerText;
    private Date dateAnswered;
    private int questionId;
    private Student answerPoster;


    public Answer(String answerText, Date dateAnswered,
                  int questionId,
                  String tNumberOfAnswerer, String passwordOfAnswerer){
        setAnswerText(answerText);
        this.dateAnswered = dateAnswered;
        this.questionId = questionId;
        this.answerPoster = new Student(tNumberOfAnswerer, passwordOfAnswerer);
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Date getDateAnswered() {
        return dateAnswered;
    }

    public int getQuestionId(){
        return questionId;
    }

    public Student getAnswerPoster(){
        return answerPoster;
    }

    public String toString(){
        return "\nAnswer: " + getAnswerText() +
                "\nDate Answered: " + getDateAnswered() +
                "\nQuestion ID: " + getQuestionId() +
                "\n" + getAnswerPoster();
    }

}
