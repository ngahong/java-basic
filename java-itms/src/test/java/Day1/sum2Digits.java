package Day1;

import java.util.Scanner;

public class sum2Digits {
    public static void main(String[] args) {
        int surplus = 0;
        int Sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input integer: ");
        int n = scanner.nextInt();
        while (n > 0) {
            surplus = n % 10;
            n = n / 10;
            Sum = Sum + surplus;
        }
        System.out.println("Sum of digits: " + Sum);
    }
}
