package Day1;

import java.util.Scanner;

public class convertToLowCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = scanner.nextLine();
        System.out.println("String after convert: " + str.toLowerCase());
    }

}
