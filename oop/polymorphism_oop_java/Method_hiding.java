package oop.polymorphism_oop_java;
/*
Why is method hiding not runtime polymorphism?
1. Static methods belong to the class, not individual objects.
2. Static methods cannot be overridden.
3. Java resolves static method calls using the reference type.
4. The JVM does not select the static method based on the actual object's type.
Therefore, method hiding is a form of static method resolution, not runtime polymorphism.

It is also sometimes described as name hiding or shadowing.
*/


class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
    //static method overloading is polymorphism
    static void display(String name){
        System.out.println("this is static method for" + name);
    }
}
class Child extends Parent{
    static void display(){
        System.out.println("Child static method");
    }
}
public class Method_hiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();

    }
}
