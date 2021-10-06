package Day1;

import java.util.Scanner;

public class covertTime {
    public static void main(String[] args) {
        int hour, minute, second;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int n = scanner.nextInt();
        hour = n / 3600;
        minute = n % 3600 / 60;
        second = n % 3600 % 60;
        System.out.printf("After convert %d seconds: %d:%d:%d",n,hour,minute,second);
    }
}
