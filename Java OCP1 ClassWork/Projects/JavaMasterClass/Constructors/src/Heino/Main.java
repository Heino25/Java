package Heino;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account(); //("12345", 0.00, "Bob Brown", "myemail.com", "(078) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer(2500.00, "Bob@gmail.com");
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("heino", 100.00, "heinoGmail.com");
        System.out.println(vip3);
    }
}
