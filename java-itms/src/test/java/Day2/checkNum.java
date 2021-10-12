package Day2;

import java.util.Scanner;

public class checkNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.println("The number " + number + " is positive" );
        else if (number < 0)
            System.out.println("The number " + number + " is negative" );
        else
            System.out.println("The number " + number + " is 0" );
    }
}
