public class typeofdata {
    public static void main(String[] args) {

        //type casting
        int a = 10;
        //automatic,widening
        double b = a;
        //manual,narrowing
        int a1 = (int)b;
        
        System.out.println(b);
        System.out.println(a1);

        //type promotion
        byte d = 10;
        byte e = 20;
        int f = d+e; 
        System.out.println(f);
        //there is function to check type of data in java

        //wrapper class

        Integer g = 15;
        String h = "Hello";

        //Autoboxing
        int x = 10; 
        // Autoboxing (Modern / Automatic)
        Integer autoBoxed = x; 

        // Manual Boxing (Explicit)
        Integer manualBoxed = Integer.valueOf(x); 

        //unboxing
        Integer objectVar = Integer.valueOf(10);

        // Auto-unboxing (Modern / Automatic)
        int autoUnboxed = objectVar; 

        // Manual Unboxing (Explicit)
        int manualUnboxed = objectVar.intValue(); 
    }
}
