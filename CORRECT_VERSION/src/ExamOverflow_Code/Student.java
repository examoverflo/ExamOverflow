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

    private String tNnumber;
    private String userPassword;

    public Student(String tNumber, String userPassword) {
        this.tNnumber = tNumber;
        this.userPassword = userPassword;
    }

    public String getTnumber() {
        return tNnumber;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String toString(){
        return "Student T-number: " + getTnumber() +
                "Student Password: " + getUserPassword();
    }
}
    

