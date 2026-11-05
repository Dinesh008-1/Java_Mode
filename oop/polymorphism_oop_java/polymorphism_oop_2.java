package oop.polymorphism_oop_java;
//Employee System
class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }
    double calculateSalary(){
        return 0.0;
    }
}
class FullTimeEmployee extends Employee{
    double monthlySalary;
    FullTimeEmployee(String name,double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override 
    double calculateSalary(){
        return this.monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
    PartTimeEmployee(String name,double hourlyRate,double hoursWorked ){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override 
    double calculateSalary(){
        return (this.hourlyRate)*(this.hoursWorked);
    }
}
class ContractEmployee extends Employee{
    double contractAmount;
    ContractEmployee(String name,double contractAmount){
        super(name);
        this.contractAmount = contractAmount;
    }
    @Override 
    double calculateSalary(){
        return this.contractAmount;
    }
}
public class polymorphism_oop_2 {
    public static void main(String[] args) {
        //Method Overiding - Run Time Polymorphism
        Employee e1 = new FullTimeEmployee("Dinesh", 57682.88);
        Employee e2 = new ContractEmployee("Karthi", 67000.52);
        Employee e3 = new PartTimeEmployee("Ragul", 5000, 5);
        System.out.println(e1.name +" Salary: "+e1.calculateSalary());
        System.out.println(e2.name +" Salary: "+e2.calculateSalary());
        System.out.println(e3.name +" Salary: "+e3.calculateSalary());
    }
}
