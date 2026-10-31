package oop;

class Employee{
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + " is working");
    }
}
class Developer extends Employee{
    String programmingLang;
    public Developer(String name,double salary,String programmingLang){
        super(name, salary);
        this.programmingLang = programmingLang;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Developer d = new Developer("Ashok", 1000000, "JAVA");
        System.out.println(d.name +'\n'+d.salary+'\n'+d.programmingLang);
    }
}
