package ExamOverflow_Code;

/**
 * Created by t00136348 on 07/12/2015.
 */
public class ExamQuestion extends Question{

    private int examYear;
    private int questionNo;

    public ExamQuestion(int examYear, int questionNo, int questionId, String tNumber, String questionText,String userPassword,Module module){
        super(questionId, tNumber, questionText,userPassword, module);
        setExamYear(examYear);
        setQuestionNo(questionNo);
    }

    public int getExamYear() {
        return examYear;
    }

    public void setExamYear(int examYear) {
        this.examYear = examYear;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public String toString(){
        return super.toString() + ", examYear = " + getExamYear() + ", question = " + getQuestionNo();
    }
}
