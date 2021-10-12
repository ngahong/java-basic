package Day1;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = scanner.nextLine();
        String str_reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse string: " + str_reverse);
    }
}
