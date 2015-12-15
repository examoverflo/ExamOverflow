package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by t00136348 on 07/12/2015.
 */
public class GeneralQuestion extends Question{

    private Date datePosted = new Date();

    public GeneralQuestion(int questionId, String questionText,Student student, Module module, Date datePosted){

        super(questionId, questionText,student,module);
        this.datePosted = datePosted;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public String toString(){
        return super.toString() + "\nDate Posted: " + getDatePosted();
    }
}
