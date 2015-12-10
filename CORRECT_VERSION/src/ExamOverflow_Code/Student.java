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


    private String Tnumber;
    private String UserPassword;

    public Student(){}

    public Student(String Tnumber, String UserPassword) {
        this.Tnumber = Tnumber;
        this.UserPassword = UserPassword;


    }

    public String getTnumber() {
        return Tnumber;
    }


    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }


}
    

