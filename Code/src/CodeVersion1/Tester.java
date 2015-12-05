package CodeVersion1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Damien on 04/12/2015.
 */
public class Tester {
    public static void main(String args[]){

        Student student =  new Student();
        List<Question> questionList = new LinkedList();

        Question question = new Question("T00000000","What time is it",new Date(System.nanoTime()),1);

        questionList.add(question);
        question = new Question("T00000000","What time is it",new Date(),2);

        questionList.add(question);
        for(Question que:questionList){
             System.out.println(que.toString());
        }

        Answer ans = new Answer("T12345678","The time is on the clock",1,new Date(),1);

        List<Answer> answers = new LinkedList();

        answers.add(ans);
        ans = new Answer("T12345678","The time is 12.33",1,new Date(),1);
        answers.add(ans);
        ans = new Answer("T12345678","The time is on the clock",1,new Date(),2);

        answers.add(ans);
        for(Answer a:answers) {
            if(a.getQuestionID()==2){
            System.out.println(a.toString());
        }
        }

    }
}
