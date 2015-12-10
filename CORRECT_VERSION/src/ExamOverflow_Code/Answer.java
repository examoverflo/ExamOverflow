package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private String answerText;
    private Date dateAnswered;
    private Question question;
    private Student answerPoster;

    public Answer(String answerText,Date dateAnswered,
                  String questionText, Date datePosted, String tNumberQuestioner, String passwordQuestioner,
                  String tNumberAnswerer, String passwordAnswerer) {
        this.answerText = answerText;
        this.dateAnswered = dateAnswered;
        this.question = new Question(questionText, datePosted, tNumberQuestioner, passwordQuestioner);
        this.answerPoster = new Student(tNumberAnswerer, passwordAnswerer);
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Date getdateAnswered() {
        return dateAnswered;
    }

    public String getQuestionText(){
        return question.getQuestionText();
    }

   @Override
    public String toString() {
        return
                "\nAnswer: " + getAnswerText() +
                        "\nDate Answered: " + getdateAnswered() +
                        "\n" + question.toString() +
                        "\n" + answerPoster.toString();
    }
}
