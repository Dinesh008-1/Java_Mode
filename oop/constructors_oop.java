package oop;
//constructor overloading
class Student{
    String name;
    int age;
    Student(){
        this.name = "Unknown";
        this.age = 0;
    }
    Student(String name){
        this.name = name;
        this.age = 0;
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Override toString() to print object fields
    @Override
    public String toString() {
        return "Student { name='" + name + "', age=" + age + " }";
    }
}
//constructor chaining this()

class Employee{
    String name;
    int age;
    String dept;
    Employee(){
        this("unknown");
    }
    Employee(String name){
        this(name,0);
    }
    Employee(String name,int age){
        this(name,age,"NIL");
    }
    Employee(String name,int age,String dept){
        this.name = name;
        this.age = age;
        this.dept=dept;
    }

    // Override toString() to print object fields
    @Override
    public String toString() {
        return "Employee { name='" + name + "', age=" + age + ", dept='" + dept + "' }";
    }
}
public class constructors_oop {
    public static void main(String[] args) {
        //constructor chaining
        Employee e1 = new Employee();
        System.out.println(e1.toString());

        //constructor overloading
        Student s1 = new Student();
        Student s2 = new Student("Dhoni");
        Student s3 = new Student("Dhoni",44);
        System.out.println("s1 = "+ s1.toString());
        System.out.println("s2 = "+ s2.toString());
        System.out.println("s3 = "+ s3.toString());
    }
}
