package Day1;

import java.util.Scanner;

public class compareExe {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int num1 = numbers.nextInt();
        System.out.print("Input second integer: ");
        int num2 = numbers.nextInt();
        compare(num1, num2);
    }

    public static void compare(int a, int b) {
        if (a != b) {
            if (a > b) {
                System.out.println(a + " != " + b);
                System.out.println(a + " > " + b);
                System.out.println(a + " >= " + b);
            } else {
                System.out.println(a + " != " + b);
                System.out.println(a + " < " + b);
                System.out.println(a + " <= " + b);
            }
        } else System.out.println(a + " = " + b);
    }
}
