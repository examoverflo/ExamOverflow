package ExamOverflow_Code;

import java.util.Date;
import java.util.List;

/**
 * Created by Damien on 04/12/2015.
 */
public class Tester {
    public static void main(String args[]) {

        Inventory inventory = new Inventory();

        initialiseInventory(inventory);

        int id = 1;

        Question desiredQuestion = inventory.searchForQuestionByQuestionId(id);

        desiredQuestion.printAnswers();
        if (desiredQuestion == null) {
            System.out.println("Question ID: " + id + " does not exist");
        } else {
            List<Answer> questionAnswer = inventory.searchForAnswersByQuestionId(desiredQuestion.getQuestionId());
            System.out.println("Searching for answer to " + desiredQuestion.toString());

            if (!questionAnswer.isEmpty()) {
                System.out.println("................\n"
                        + "Here are all the answers:");
                for (Answer answer : questionAnswer) {
                    System.out.println(answer.toString());
                }
            } else {
                System.out.println("Unfortunately, no answers have been given for this question");
            }

        }

        String search;


        System.out.println("\n\n\n\n");
        //test get questions for certain t-number
        search = "t003";

        List<Question> questions = inventory.searchWhoPostedQuestion(search);
        System.out.println("Searching for questions asked by " + search);

        if (!questions.isEmpty()) {
            System.out.println("................\n"
                    + "Here are all the questions:");
            for (Question question : questions) {
                System.out.println(question.getQuestionText());
            }
        } else {
            System.out.println("Unfortunately, no questions have been asked by this student");
        }

        System.out.println("\n\n\n\n");

        //test search for answers for certain t-number
        search = "t002";

        List<Answer> answers = inventory.searchForAnswersByTNumber(search);
        System.out.println("Searching for answers posted by " + search);

        if (!answers.isEmpty()) {
            System.out.println("................\n"
                    + "Here are all the answers:");
            for (Answer answer : answers) {
                System.out.println(answer.getAnswerText());
            }
        } else {
            System.out.println("Unfortunately, no answers have been provided by this student");
        }

        Module searchModule = Module.OOP4;

        List<Question> matchingQuestions = inventory.getQuestionsByModule(searchModule);

        if(!matchingQuestions.isEmpty()){
            System.out.println("................\n"
                    + "Here are all the questions for " + searchModule);
            for(Question question:matchingQuestions){
                System.out.println(question.toString());
            }
        }
        else{
            System.out.println("Unfortunately there are no questoins for " + searchModule);
        }




    }

        private static void initialiseInventory (Inventory inventory){

        Student s1 = new Student("t001", "password1");
        inventory.addStudent(s1);
        Student s2 = new Student("t002", "password2");
        inventory.addStudent(s2);
        Student s3 = new Student("t003", "password3");
        inventory.addStudent(s3);

        Question q1 = new Question(1, "What is OOP", new Date(), s1.getTNumber(), s1.getUserPassword(),Module.OOP3);
        inventory.addQuestion(q1);
        Question q2 = new Question(2, "What is polymorphism", new Date(), s2.getTNumber(), s2.getUserPassword(),Module.OOP4);
        inventory.addQuestion(q2);
        Question q3 = new Question(3, "What is a checked exception", new Date(), s3.getTNumber(), s3.getUserPassword(),Module.OOP4);
        inventory.addQuestion(q3);

        Answer a1 = new Answer("I have no idea", new Date(),
                1,
                s1.getTNumber(), s1.getUserPassword());
        inventory.addAnswer(a1);
        Answer a2 = new Answer("Me neither", new Date(),
                1,
                s2.getTNumber(), s2.getUserPassword());
        inventory.addAnswer(a2);
        Answer a3 = new Answer("Not a clue", new Date(),
                1,
                s1.getTNumber(), s1.getUserPassword());
        inventory.addAnswer(a3);

        }

    }