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
public class HR extends Employees {

    private String role;
    private int salary;

    public HR (String firstName, String lastName, char gender, double age, int idNumber){
        super(firstName, lastName, gender, age, idNumber);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Role: " + getRole());
        System.out.println("salary: " + getSalary());
    }

    public String getRole() {
        return role;
    }

    public void setRole() {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

}

