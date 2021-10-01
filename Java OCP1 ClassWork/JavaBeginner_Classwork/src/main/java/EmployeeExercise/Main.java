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
        HR emp01 = new HR("heino", "du Plessis", 'M', 26, 950301);
        HR emp02 = new HR("Fabio", "pita", 'M', 20, 970701);
        emp01.display();
        System.out.println("..........\n");
        emp02.display();
    }
}
