/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeExercise;

/**
 *
 * @author Heino
 */
public class Main {
    public static void main(String[] args) {
        Employees emp1 = new Employees ("Heino", "du Plessis", 'M', 26, 950301);
        Employees emp2 = new Employees ("Fabio", "Pito", 'M', 20, 945367);
        Employees emp3 = new Employees ("Conrad", "Smith", 'M', 38, 932134);
        Employees emp4 = new Employees ("John", "Wick", 'M', 55, 765432);
        
        emp1.display();
        System.out.println("-------------------------------------");
        emp2.display();
        System.out.println("-------------------------------------");
        emp3.display();
        System.out.println("-------------------------------------");
        emp4.display();
    }
}
