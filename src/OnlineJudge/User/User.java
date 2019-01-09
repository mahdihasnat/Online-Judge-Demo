/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineJudge.User;

/**
 *
 * @author MAHDI
 */
public class User {
    String Name;
    String Handle;
    String Email;
    String Country;
    String University;
    String Password;

    public User(String Name, String Handle, String Email, String Country, String University, String Password) {
        if(Country.equals("")) Country="Bangladesh";
        if(University.equals("")) University="BUET";
        this.Name = Name;
        this.Handle = Handle;
        this.Email = Email;
        this.Country = Country;
        this.University = University;
        this.Password = Password;
    }

    // solaimon 123
    // mahdi 
}
