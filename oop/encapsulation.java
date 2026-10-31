package oop;

class BankAccount{
    //1.private variable - data hiding
    private double balance;
    //2.public methods protecting invariant of object
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void withDraw(double amt){
        if(amt<=0 || amt>this.balance){
            return;
        }
        balance-=amt;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(2000);
        System.out.println(b1.getBalance());
        b1.withDraw(1250);
        System.out.println(b1.getBalance());
    }
}
