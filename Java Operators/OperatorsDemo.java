public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        int c = 7;
        System.out.println("\nIncrement/Decrement Operators:");
        System.out.println("c = " + c);
        System.out.println("c++ = " + (c++));
        System.out.println("++c = " + (++c));
        System.out.println("c-- = " + (c--));
        System.out.println("--c = " + (--c));
    }
}
