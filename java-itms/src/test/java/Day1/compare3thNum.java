package Day1;

import java.util.Scanner;

public class compare3thNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        int sum = num1+num2;
        if(sum==num3)
            System.out.println("The result is: true");
        else
            System.out.println("The result is: false");
    }
}
