package oop.polymorphism_oop_java;
//compile-time-polymorphism
class Calculator{
    void add(int a,int b){
        System.out.println("Addition: "+ (a+b));
    }
    void add(double a, double b){
        System.out.println("Addition: "+ (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Addition: "+ (a+b+c));
    }
    void add(String a,String b){
        System.out.println("Concatenation: "+ a.concat(b));
    }
}


public class polymorphism_oop {
    public static void main(String[] args) {
        //Method Overloading - Compile Time Polymorphism
        Calculator c = new Calculator();
        c.add(3,5);
        c.add(5.5,10.5);
        c.add(6,9,11);
        c.add("MS","Dhoni");


    }
}
