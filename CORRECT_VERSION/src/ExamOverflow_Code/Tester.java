package ExamOverflow_Code;

import java.util.Date;
import java.util.List;

/**
 * Created by Damien on 04/12/2015.
 */
public class Tester {
    public static void main(String args[]){

        Inventory inventory = new Inventory();
        initiliseInventory(inventory);

        System.out.println(new Date());
        String search = "What is OOP";

        List<Answer> questionAnswer = inventory.searchForAnswers(search);
        System.out.println("Searching for answer to " + search);

        if(!questionAnswer.isEmpty()) {
            System.out.println("................\n"
                             + "Here are all the answers:");
            for (Answer answer : questionAnswer) {
                System.out.println(answer.getAnswerText());
            }
        }
        else {
            System.out.println("Unfortunately, no answers have been given for this question");
        }
    }

    private static void initiliseInventory(Inventory inventory){

        Student s1 = new Student("t001", "password1");
        inventory.addStudent(s1);
        Student s2 = new Student("t002", "password2");
        inventory.addStudent(s2);
        Student s3 = new Student("t003", "password3");
        inventory.addStudent(s3);

        Question q1 = new Question("What is OOP", new Date(), s1.getTNumber(), s1.getUserPassword());
        inventory.addQuestion(q1);
        Question q2 = new Question("What is polymorphism", new Date(), s2.getTNumber(), s2.getUserPassword());
        inventory.addQuestion(q2);
        Question q3 = new Question("What is a checked exception", new Date(), s3.getTNumber(), s3.getUserPassword());
        inventory.addQuestion(q3);

        //all answering the first question
        Answer a1 = new Answer("I have no idea", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s3.getTNumber(), s3.getUserPassword());
        inventory.addAnswer(a1, q1);
        Answer a2 = new Answer("Me neither", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s2.getTNumber(), s2.getUserPassword());
        inventory.addAnswer(a2, q1);
        Answer a3 = new Answer("Not a clue", new Date(),
                q1.getQuestionText(), q1.getDatePosted(), q1.getStudent().getTNumber(), q1.getStudent().getUserPassword(),
                s2.getTNumber(), s2.getUserPassword());
        inventory.addAnswer(a3, q1);

        //inventory.
        //inventory.addAnswer("T12345678","OOP is object oriantated programming.",1,new Date(),1);
        //inventory.addAnswer("T12345678","The time is on the clock",1,new Date(),2);

    }
}
