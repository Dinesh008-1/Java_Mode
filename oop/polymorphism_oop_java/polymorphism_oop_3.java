package oop.polymorphism_oop_java;
//runtime Polymorphism

class Payment{
    void pay(double amount){
        System.out.println("Processing generic payment "+amount);
    }
}
class CreditCardPayment extends Payment{
    void pay(double amount){
        System.out.println("Processing credit card Payment "+ amount);
    }
}
class UPIpayment extends Payment{
    void pay(double amount){
        System.out.println("Processing UPI Payment "+ amount);
    }
}
public class polymorphism_oop_3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(500000);
        Payment p2 = new UPIpayment();
        p2.pay(90000);
    }
}
