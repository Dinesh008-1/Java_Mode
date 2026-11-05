package oop.polymorphism_oop_java;
//method hiding is not a polymorphism
//because static method always belongs to reference it does not consider any child class method so it is not method overiding , it is method hiding, also it will not come static polymorphism because it is just name shadowing--the child's static method does not provide an alternative form of the parent's method. Instead, it completely blocks visibility to the parent's method within the child's scope—exactly like hiding a global variable by declaring a local variable with the same name. Name shadowing is a scope-resolution feature

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
        //no overriding just method belongs to the class reference runs
        Parent p = new Child();
        p.display();
        //method hiding - name shadowed the parent method due to static scope resolution feature
        Child c = new Child();
        c.display();
    }
}
