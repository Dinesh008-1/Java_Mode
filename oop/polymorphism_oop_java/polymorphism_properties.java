package oop.polymorphism_oop_java;
class Vehicle{
    void start(){
        System.out.println("Starting an vehicle");
    }
}
class Car extends Vehicle{
    @Override 
    void start(){
        System.out.println("Starting an car");
    }
    void openTrunk(){
        System.out.println("opening trunck");
        
    }
}
class Bike extends Vehicle{
    @Override 
    void start(){
        System.out.println("Starting an bike");
    }
    void kickStart(){
        System.out.println("kickStarting a bike");
        
    }
}
public class polymorphism_properties {
    public static void main(String[] args) {
        //upcasting
        Vehicle v1 = new Car();
        v1.start();
        Vehicle v2 = new Bike();
        v2.start();
        //Downcasting
        if(v1 instanceof Car){
            Car c1 = (Car)v1;
            c1.openTrunk();
        }
        // prevent from ClassCastException
        if(v1 instanceof Bike){
            Bike b1 = (Bike)v1;
            b1.kickStart();
        }
        if(v2 instanceof Bike){
            Bike b2= (Bike)v2;
            b2.kickStart();
        }

    }
}
