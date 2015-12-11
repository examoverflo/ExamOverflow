package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Damien on 03/12/2015.
 */
public class Answer {

    private String answerText;
    private Date dateAnswered;
    //private Question question;
    private int questionId;
    private Student answerPoster;

/*    public Answer(String answerText,Date dateAnswered,
                  String questionText, Date datePosted, String tNumberQuestioner, String passwordQuestioner,
                  String tNumberAnswerer, String passwordAnswerer) {
        setAnswerText(answerText);
        this.dateAnswered = dateAnswered;
        this.question = new Question(questionText, datePosted, tNumberQuestioner, passwordQuestioner);
        this.answerPoster = new Student(tNumberAnswerer, passwordAnswerer);
    }
*/
    public Answer(String answerText, Date dateAnswered,
                  int questionId,
                  String tNumberOfAnswerer){
        setAnswerText(answerText);
        this.dateAnswered = dateAnswered;
        this.questionId = questionId;
        this.answerPoster = new Student(tNumberOfAnswerer);
    }

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
/*
    public Question getQuestion(){
        return question;
    }
*/
    public int getQuestionId(){
        return questionId;
    }

    public Student getAnswerPoster(){
        return answerPoster;
    }
/*
   @Override
    public String toString() {
        return
                "\nAnswer: " + getAnswerText() +
                        "\nDate Answered: " + getDateAnswered() +
                        "\n" + question.toString() +
                        "\n" + answerPoster.toString();
    }
*/
    public String toString(){
        return "\nAnswer: " + getAnswerText() +
                "\nDate Answered: " + getDateAnswered() +
                "\nQuestion ID: " + getQuestionId() +
                "\n" + answerPoster.toString();
    }

}
