package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
class Answer {

    private String answerText;
    private final Date dateAnswered;
    private final int questionId;
    private final Student answerPoster;


    public Answer(String answerText, Date dateAnswered,
                  int questionId,
                  Student student){
        setAnswerText(answerText);
        this.dateAnswered = dateAnswered;
        this.questionId = questionId;
        this.answerPoster = student;
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
                "\nAnswer Poster: " + getAnswerPoster().getTNumber();
    }

}
