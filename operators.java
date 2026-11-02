public class operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. ARITHMETIC OPERATORS
        System.out.println("=== Arithmetic Operators ===");
        System.out.println(a + b);  // Addition: 13
        System.out.println(a - b);  // Subtraction: 7
        System.out.println(a * b);  // Multiplication: 30
        System.out.println(a / b);  // Integer division: 3
        System.out.println(a % b);  // Remainder: 1


        // 2. RELATIONAL OPERATORS
        System.out.println("\n=== Relational Operators ===");
        System.out.println(a == b); // Equal: false
        System.out.println(a != b); // Not equal: true
        System.out.println(a > b);  // Greater than: true
        System.out.println(a < b);  // Less than: false
        System.out.println(a >= b); // Greater/equal: true
        System.out.println(a <= b); // Less/equal: false


        // 3. LOGICAL OPERATORS
        System.out.println("\n=== Logical Operators ===");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // AND: both true
        System.out.println(x || y); // OR: at least one true
        System.out.println(!x);     // NOT: reverses true to false

        // Short-circuit: skips right side if result is known
        int num = 10;
        System.out.println(num > 5 || ++num > 20); // true
        System.out.println(num); // 10: ++num was skipped


        // 4. ASSIGNMENT OPERATORS
        System.out.println("\n=== Assignment Operators ===");
        int n = 10;

        n += 5;
        System.out.println(n); // Add and assign: 15

        n -= 3;
        System.out.println(n); // Subtract and assign: 12

        n *= 2;
        System.out.println(n); // Multiply and assign: 24

        n /= 4;
        System.out.println(n); // Divide and assign: 6

        n %= 4;
        System.out.println(n); // Remainder and assign: 2


        // 5. UNARY OPERATORS
        System.out.println("\n=== Unary Operators ===");
        int p = 5;

        System.out.println(+p);  // Unary plus: 5
        System.out.println(-p);  // Unary minus: -5
        System.out.println(++p); // Pre-increment: 6
        System.out.println(p++); // Post-increment: 6, then p becomes 7
        System.out.println(p);   // Current value: 7
        System.out.println(--p); // Pre-decrement: 6
        System.out.println(p--); // Post-decrement: 6, then p becomes 5
        System.out.println(~p);  // Bitwise complement: -6
        System.out.println(!x);  // Logical NOT: false


        // 6. TERNARY OPERATOR
        System.out.println("\n=== Ternary Operator ===");
        int age = 20;

        String result = age >= 18 ? "Adult" : "Minor";
        // condition ? true value : false value
        System.out.println(result); // Adult


        // 7. BITWISE OPERATORS
        System.out.println("\n=== Bitwise Operators ===");
        int m = 5; // Binary: 0101
        int k = 3; // Binary: 0011

        System.out.println(m & k);  // AND: 1 (0001)
        System.out.println(m | k);  // OR: 7 (0111)
        System.out.println(m ^ k);  // XOR: 6 (0110)
        System.out.println(~m);     // Complement: -6
        System.out.println(m << 1); // Left shift: 10
        System.out.println(m >> 1); // Signed right shift: 2
        System.out.println(m >>> 1);// Unsigned right shift: 2


        // 8. OPERATOR PRECEDENCE
        System.out.println("\n=== Operator Precedence ===");

        int value = 10 + 5 * 2;
        // Multiplication before addition
        System.out.println(value); // 20

        int value2 = (10 + 5) * 2;
        // Parentheses evaluated first
        System.out.println(value2); // 30

        boolean value3 = 10 + 5 > 12 && 20 < 30;
        // Arithmetic > Relational > Logical AND
        System.out.println(value3); // true
    }
}


