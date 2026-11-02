public class typeofdata {
    public static void main(String[] args) {

        // // 1. BYTE (1 byte)
        // byte age = 25; // Small integer: -128 to 127

        // // 2. SHORT (2 bytes)
        // short salary = 30000; // Integer: -32,768 to 32,767

        // // 3. INT (4 bytes)
        // int population = 100000; // Whole number

        // // 4. LONG (8 bytes)
        // long distance = 9876543210L; // Large integer (L suffix)

        // // 5. FLOAT (4 bytes)
        // float height = 5.9f; // Decimal number (f suffix)

        // // 6. DOUBLE (8 bytes)
        // double price = 999.99; // Decimal number (default decimal type)

        // // 7. CHAR (2 bytes)
        // char grade = 'A'; // Single character (single quotes)

        // // 8. BOOLEAN (JVM-dependent storage)
        // boolean isStudent = true; // true or false


        // // NON-PRIMITIVE / REFERENCE DATA TYPES

        // // 9. STRING
        // String name = "Dinesh"; // Sequence of characters

        // // 10. ARRAY
        // int[] marks = {85, 90, 95}; // Collection of same-type values

        // // 11. CLASS / OBJECT
        // Student student = new Student("Arun", 21); // Object creation

        // // 12. INTERFACE REFERENCE
        // Animal animal = new Dog(); // Interface implemented by Dog

        // // 13. ENUM
        // Day today = Day.MONDAY; // Fixed set of constants

        // // 14. RECORD (Java 16+)
        // Person person = new Person("Bala", 22); // Data-carrying object


        // // PRINT PRIMITIVE TYPES
        // System.out.println("=== Primitive Types ===");
        // System.out.println(age);
        // System.out.println(salary);
        // System.out.println(population);
        // System.out.println(distance);
        // System.out.println(height);
        // System.out.println(price);
        // System.out.println(grade);
        // System.out.println(isStudent);


        // // PRINT REFERENCE TYPES
        // System.out.println("\n=== Reference Types ===");
        // System.out.println(name);
        // System.out.println(marks[0]); // First array element
        // System.out.println(student.name);
        // System.out.println(animal.sound());
        // System.out.println(today);
        // System.out.println(person.name());


        // //type casting
        // int a = 10;
        // //automatic,widening
        // double b = a;
        // //manual,narrowing
        // int a1 = (int)b;
        
        // System.out.println(b);
        // System.out.println(a1);

        // //type promotion
        // byte d = 10;
        // byte e = 20;
        // int f = d+e; 
        // System.out.println(f);
        // //there is no function to check type of data in java

        // //wrapper class

        // Integer g = 15;
        // String h = "Hello";

        // //Autoboxing
        // int x = 10; 
        // // Autoboxing (Modern / Automatic)
        // Integer autoBoxed = x; 

        // // Manual Boxing (Explicit)
        // Integer manualBoxed = Integer.valueOf(x); 

        // //unboxing
        // Integer objectVar = Integer.valueOf(10);

        // // Auto-unboxing (Modern / Automatic)
        // int autoUnboxed = objectVar; 

        // // Manual Unboxing (Explicit)
        // int manualUnboxed = objectVar.intValue(); 



        //Integer Cache

        //only wihtin this range -128 to 127
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2); //True
        System.out.println(i1.equals(i2));//true
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3==i4); //False
        System.out.println(i3.equals(i4)); //true

        //Integer.ValueOf()
        Integer i5 = Integer.valueOf(100);

        //var keyword - uses Local variable type inference

        var i6 = 25;
        var i7 = "Dhoni";
            // can use for loop but not for method return type, instance variable also cannot use null values.
            var numbers = new int[]{10, 20, 30};

            for (var num : numbers) {
                System.out.println(num);
            }



    }
}

// CLASS
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// INTERFACE
interface Animal {
    String sound();
}

// IMPLEMENTATION
class Dog implements Animal {
    public String sound() {
        return "Bark";
    }
}

// ENUM
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

// RECORD
record Person(String name, int age) {}
