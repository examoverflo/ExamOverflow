/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExamOverflow_Code;

/**
 * @author t00153953
 */
public class Student {

    private String tNumber;
    private String userPassword;

    public Student(String tNumber, String userPassword) {
        this.tNumber = tNumber;
        setUserPassword(userPassword);
    }

    public Student(String tNumber) {
        this.tNumber = tNumber;
    }

    public String getTNumber() {
        return tNumber;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String toString(){
        if (getUserPassword() == null)
            return "Student T-number: " + getTNumber();
        else
            return "Student T-number: " + getTNumber() +
                "Student Password: " + getUserPassword();
    }
}
    

