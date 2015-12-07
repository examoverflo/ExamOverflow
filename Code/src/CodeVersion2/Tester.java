package CodeVersion2;

import CodeVersion2.Answer;
import CodeVersion2.Inventory;

import java.util.Date;
import java.util.List;

/**
 * Created by Damien on 04/12/2015.
 */
public class Tester {
    public static void main(String args[]){

        Inventory inventory = new Inventory();
        initiliseInventory(inventory);

        System.out.println("John logs into the system.......\n\n");

        System.out.println("John wants to ask a question about SQL after his Datebase Design class.\n");

        inventory.addGeneralQuestion("T00112233", "How do you write triggers in pl/sql",
                4, new Date(), Module.DATABASE_DESIGN, Topic.SQL);


        searchForAnswers(inventory, 4);

        System.out.println("John logs out of the system.......\n");

        inventory.addAnswer("T12345679", "To write triggers in pl/sql you need to learn the syntax", 4, new Date(), 4);

        System.out.println("The nest day John logs back into the system to check for answers......\n");

        searchForAnswers(inventory,4);

        System.out.println();
    }

    private static void searchForAnswers(Inventory inventory,int questionId) {
        List<Answer> questionAnswer = inventory.search(questionId);

        System.out.println("Searching for answer to...John's question....\n");

        if(!questionAnswer.isEmpty()) {
            System.out.println("................\n"
                             + "Here are all the answers:");
            for (Answer answer : questionAnswer) {
                System.out.println(answer.toString());
            }
        }
        else {
            System.out.println("Unfortunately, no answers have been given for this question");
        }
    }

    private static void initiliseInventory(Inventory inventory){

        inventory.addGeneralQuestion("T00000000", "What does OOP stand for.", 1, new Date(), Module.OOP3, Topic.JAVA);
        inventory.addGeneralQuestion("T00000000", "What is a primary key.", 2, new Date(), Module.DATABASE_DESIGN, Topic.SQL);

        inventory.addExamQuestion("T00000011", "Explain the difference between method overloading and method overiding.",
                3, 2014, 2, Module.OOP4);

        inventory.addAnswer("T12345678","OOP stands for Object Orientated Programming.",1,new Date(),1);
        inventory.addAnswer("T12345678", "A primary key is a unique identifier", 2, new Date(), 2);



    }
}
