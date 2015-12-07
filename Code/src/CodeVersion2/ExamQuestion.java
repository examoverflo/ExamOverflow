package CodeVersion2;

/**
 * Created by t00136348 on 07/12/2015.
 */
public class ExamQuestion extends Question{

    private int examYear;
    private int questionNo;
    /*module enum*/
    public ExamQuestion(int examYear, int questionNo, int questionId, String tNumber, String questionText, Module module){
        super(tNumber, questionText, questionId, module);
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
