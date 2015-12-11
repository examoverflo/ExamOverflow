package ExamOverflow_Code;

import java.util.Date;

/**
 * Created by Gerard on 11/12/2015.
 */
public class TestForAddingListOfAnswersToQuestion {
    public static void main(String[] args){
        Student s1 = new Student("t001", "password1");
        Student s2 = new Student("t002", "password2");
        Student s3 = new Student("t003", "password3");

        Question q1 = new Question("What is OOP", new Date(), s1.getTNumber(), s1.getUserPassword());
        Question q2 = new Question("What is polymorphism", new Date(), s2.getTNumber(), s2.getUserPassword());
        Question q3 = new Question("What is a checked exception", new Date(), s3.getTNumber(), s3.getUserPassword());

        Answer a1 = new Answer("I have no idea", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s3.getTNumber(), s3.getUserPassword());
        Answer a2 = new Answer("Me neither", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s2.getTNumber(), s2.getUserPassword());
        Answer a3 = new Answer("Not a clue", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s2.getTNumber(), s2.getUserPassword());

        System.out.println("adding a1 to q1.......");
        q1.setAnswer(a1);
        System.out.println("adding a2 to q1.......");
        q1.setAnswer(a2);

        System.out.println("printing q1.......");
        System.out.println(q1.toString());
    }
}
