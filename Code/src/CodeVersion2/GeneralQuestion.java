package CodeVersion2;

import java.util.Date;

/**
 * Created by t00136348 on 07/12/2015.
 */
public class GeneralQuestion extends Question{
    //need enum for topic

    private Date datePosted = new Date();

    public GeneralQuestion(String tNumber, String questionText, int questionId, Date datePosted){
        //questionId datePosted tNumber questionText;
        super(tNumber, questionText, questionId);
        setDatePosted(datePosted);
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public String toString(){
        return super.toString() + ", datePosted=" + getDatePosted();
    }
}
