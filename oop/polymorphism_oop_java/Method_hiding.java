package oop.polymorphism_oop_java;
/*
undrstand polymorphism
Is polymorphism happening when you use a Child reference (Child c = new Child())?
No, polymorphic behavior isn't being used or demonstrated there.
(Polymorphism only comes into play when you use a general/parent interface to hide the specific object type)
The compiler and JVM already know for an absolute fact that c is a Child. There are no "multiple forms" to choose from because you locked the reference type directly to the Child class. It's just a direct, straightforward method call.
*/
//method hiding is not a polymorphism because it belongs to reference type no different forms occurs
//because static method always belongs to reference it does not consider any child class method so it is not method overiding , it is method hiding, also it will not come static polymorphism because it is just name shadowing--the child's static method does not provide an alternative form of the parent's method. Instead, it completely blocks visibility to the parent's method within the child's scope—exactly like hiding a global variable by declaring a local variable with the same name. Name shadowing is a scope-resolution feature
//overloading and overriding are only polymorphism name shadowing is not considered as polymorphism since it is only belongs to reference type it is just name shadowing
// when parent reference use child object method that where only method overiding happens polymorphism occurs. if child reference has child object here no polymorphism or method overriding happens


// clearly in method hiding compiler already knoww this is the method it is going to run no different forms which avoids the propety of polymorphism 
// like overriding - parent refernce methods overriden by childs objects method ,


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
        //method hiding - name shadowed the child's method hid the parent's method. Through a parent reference, the parent's version is still fully accessible and gets executed. due to static scope resolution feature.
        //child's method hid the parent's method child and parent method are not related
        Parent p = new Child();
        p.display();

    }
}
