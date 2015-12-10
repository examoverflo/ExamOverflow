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

        List<Answer> questionAnswer = inventory.search(1);
        System.out.println("Searching for answer to ");

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

        inventory.addQuestion("T00000001","What is OOP",new Date(),1);
        inventory.addQuestion("T00000000","What is Encapsulation",new Date(),2);
        inventory.addQuestion("T00000001","What is OOAD",new Date(),3);
        inventory.addQuestion("T00000000","What is Polymorphismn",new Date(),4);
        inventory.addAnswer("T12345678","OOP is object oriantated programming.",1,new Date(),1);
        inventory.addAnswer("T12345678","The time is on the clock",1,new Date(),2);

    }
}
