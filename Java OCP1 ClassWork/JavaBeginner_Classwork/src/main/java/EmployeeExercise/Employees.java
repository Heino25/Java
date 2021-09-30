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
public class Employees {
    private String firstName;
    private String lastName;
    private char gender;
    private double age;
    private int idNumber;

    
    public Employees(String firtsName, String lastName, char gender, double age, int idNumber) {
        this.firstName = firtsName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.idNumber = idNumber;
    }

    
    public void display() {
        System.out.println("firtsName: " + getFirstName());
        System.out.println("lastName: " + getLastName());
        System.out.println("age Code: " + getGender());
        System.out.println("idNumber: " + getIdNumber());
    }
    public String getFirtsName() {
        return firstName;
    }

    public void setFirtsName(String firtsName) {
        this.firstName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    private String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String Employees(){
        return "\nfirtsName: " + getFirstName()
                + "\nlastName: " + getLastName() 
                + "\nage Code: " + getGender()
                + "idNumber: " + getIdNumber();
    }
    
}
