/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise10_2;

/**
 *
 * @author Heino
 */
public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}

