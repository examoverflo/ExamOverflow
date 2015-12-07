package CodeVersion2;

import java.util.Date;

/**
 * Created by t00136348 on 07/12/2015.
 */
public class GeneralQuestion extends Question{

    private Date datePosted = new Date();
    private Topic topic;

    public GeneralQuestion(String tNumber, String questionText, int questionId, Date datePosted, Module module, Topic topic){

        super(tNumber, questionText, questionId, module);
        this.datePosted = datePosted;
        this.topic = topic;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public Topic getTopic(){
        return topic;
    }
    public String toString(){
        return super.toString() + "\nDate Posted: " + getDatePosted() + "\nTopic: " + getTopic();
    }
}
