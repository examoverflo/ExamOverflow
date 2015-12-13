package ExamOverflow_Code;

import java.util.Date;
import java.util.List;

/**
 * Created by Gerard on 11/12/2015.
 */
public class TestForAddingListOfAnswersToQuestion {
    public static void main(String[] args){
        Student s1 = new Student("t001", "password1");
        Student s2 = new Student("t002", "password2");
        Student s3 = new Student("t003", "password3");

        //int questionId, String questionText, Date datePosted, String tNumber, String userPassword
        Question q1 = new GeneralQuestion(1, "What is OOP", s1.getTNumber(), s1.getUserPassword(),Module.OOP3, new Date());
        Question q2 = new ExamQuestion(2015,2,1, "What is polymorphism", s2.getTNumber(), s2.getUserPassword(),Module.OOP4);
        Question q3 = new GeneralQuestion(3, "What is a checked exception", s3.getTNumber(), s3.getUserPassword(),Module.OOP4, new Date());

        System.out.println(q3.toString());
        System.out.println(q2.toString());

        Answer a1 = new Answer("I have no idea", new Date(),
                1,
                s3.getTNumber(), s3.getUserPassword());
        Answer a2 = new Answer("Me neither", new Date(),
                1,
                s2.getTNumber(), s2.getUserPassword());
        Answer a3 = new Answer("Not a clue", new Date(),
                1,
                s2.getTNumber(), s2.getUserPassword());

        System.out.println("adding a1 to q1.......");
        q1.setAnswer(a1);
        System.out.println("adding a2 to q1.......");
        q1.setAnswer(a2);
        System.out.println("adding a3 to q1.......");
        q1.setAnswer(a3);

        System.out.println("printing q1.......");
        System.out.println(q1.toString());

        List<Answer> matchAns = q1.getAllAnswers();
        System.out.println("??????????????????????????????????????????????\n?????????????????????????????????");
        for(Answer ans:matchAns) {
            System.out.println(ans.toString());
        }
    }
}
