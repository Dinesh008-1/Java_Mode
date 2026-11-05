package oop.basics;

class Address{
    String city;
    public Address(String city){
        this.city = city;
    }
}
class Person implements Cloneable{
    String name;
    Address address;

    public Person(String name,Address address){
        this.name = name;
        this.address = address;
    }
    public Person shallowCopy() throws CloneNotSupportedException{
        return (Person) super.clone();
    }
    public Person deepCopy(){
        Address clonedAddress = new Address(this.address.city);
        return new Person(this.name, clonedAddress);
    }
}
public class copying_objects {
    public static void main(String[] args) throws CloneNotSupportedException {
// --- 1. SHALLOW COPY DEMO ---
        Address sharedAddress = new Address("Tiruvannamalai");
        Person p1 = new Person("Dinesh", sharedAddress);

        // Create shallow copy
        Person p2 = p1.shallowCopy();
        
        // Modify the nested object's property via the copy
        p2.address.city = "Chennai";

        System.out.println("--- Shallow Copy Result ---");
        System.out.println("p1 city: " + p1.address.city); // Prints "London" (Affected!)
        System.out.println("p2 city: " + p2.address.city); // Prints "London"

        // --- 2. DEEP COPY DEMO ---
        Address independentAddress = new Address("Tiruvannamalai");
        Person p3 = new Person("Dinesh", independentAddress);

        // Create deep copy
        Person p4 = p3.deepCopy();
        
        // Modify the nested object's property via the copy
        p4.address.city = "Chennai";

        System.out.println("\n--- Deep Copy Result ---");
        System.out.println("p3 city: " + p3.address.city); // Prints "New York" (Safe/Unaffected!)
        System.out.println("p4 city: " + p4.address.city); // Prints "Paris"        
    }
}
