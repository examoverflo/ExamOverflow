/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Code;

/**
 * @author t00153953
 */
public class Student {


    private String Tnumber;
    private String Username;
    private String UserPassword;

    public Student(){}

    public Student(String Tnumber, String Username, String UserPassword) {
        this.Tnumber = Tnumber;
        this.UserPassword = UserPassword;
        this.Username = Username;

    }


    public String getTnumber() {
        return Tnumber;
    }

    public String getUsername() {
        return Username;
    }

    public String getUserPassword() {
        return UserPassword;
    }


    public void setTnumber(String Tnumber) {
        this.Tnumber = Tnumber;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }


}
    

