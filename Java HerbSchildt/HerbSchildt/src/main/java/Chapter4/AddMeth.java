/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author Heino
 */
class AddMeth {  
  public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    Vehicle sportscar = new Vehicle();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
 
    System.out.print("Minivan can carry " + minivan.passengers + 
                     ". "); 
 
    minivan.range(); // display range of minivan 
 
    System.out.print("Sportscar can carry " + sportscar.passengers + 
                     ". "); 
     
    sportscar.range(); // display range of sportscar. 
  }  
  
  void myMeth() { 
  int i; 
 
  for(i=0; i<10; i++) { 
    if(i == 5) return; // stop at 5 
    System.out.println(); 
  } 
}
}
