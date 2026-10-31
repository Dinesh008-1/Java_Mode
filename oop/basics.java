package oop;


class Car {
    String name = "ford";
    int speed; //instance variable
    
    void accelarate(){
        speed+=10;
    }
    
}
public class basics {
    public static void main(String[] args) {
        Car c1 = new Car();
        //same reference
        Car c2 = c1;

        c1.speed = 30;
        System.out.println(c1.speed);
        c2.speed = 70;
        System.out.println(c1.speed);
        //new - c2 has new reference
        c2 = new Car();
        //garbage collection
        c2 = null;
    }
}
