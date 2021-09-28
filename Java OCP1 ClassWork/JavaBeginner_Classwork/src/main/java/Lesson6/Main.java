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
        Employees empl = new Employees("John","Wick",50,"0792345678",239695843);
        Employees emp2 = new Employees("Heino", "du Plessis",26,"0791830097",950301524); 
        Employees emp3 = new Employees("Dirk", "du Tiot",25,"0794510097",940301524);
        
        Employees[] myEmps = {empl,emp2,emp3};
        
        for(Employees emp : myEmps){
        emp.displaydetails();
            System.out.println("\n");
        }
        
//        empl.displaydetails();
//        System.out.println("................................"
//                + "\n................................");
//        emp2.displaydetails();
//        empl.name = "John";
//        empl.surname = "Wick";
//        empl.age = 50;
//        empl.contactNum = "0792345678";
//        empl.identityNum = 239695843;
       
        
//        System.out.println("Name: " + empl.getName());
//        System.out.println("Surname: " + empl.getSurname());
//        System.out.println("Age: " + empl.getAge());
//        System.out.println("Contact Number: " + empl.getContactNum());
//        System.out.println("ID Number: " + empl.getIdentityNum());
          

    }
}
