/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author Heino
 */
public class Main {
    public static void main(String[] args) {
        Employees empl = new Employees();
        
        empl.name = "John";
        empl.surname = "Wick";
        empl.age = 50;
        empl.contactNum = "0792345678";
        empl.identityNum = 239695843;
        
        empl.setAge(55);
        
        System.out.println("Name: " + empl.getName());
        System.out.println("Surname: " + empl.getSurname());
        System.out.println("Age: " + empl.getAge());
        System.out.println("Contact Number: " + empl.getContactNum());
        System.out.println("ID Number: " + empl.getIdentityNum());
    }
}
