/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author Heino
 */
public class StringArray {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Heino";
        names[1] = "Lesedi";
        names[2] = "Moabi";
        names[3] = "Elgin";
        
        for (String name : names){
            System.out.println("My name is " + name);
            if (name == "Moabi"){
                break;
            }
        }
            
    }
}
