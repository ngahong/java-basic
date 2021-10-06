package Day1;
import java.util.Scanner;
public class convertStringToInt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number (string): ");
        String number = scanner.nextLine();
        int number_val = Integer.parseInt(number);
        System.out.println("The integer value is: " + number_val);
    }
}
