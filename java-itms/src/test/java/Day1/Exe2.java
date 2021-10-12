package Day1;

import java.util.Scanner;

public class Exe2 {
    public static void main(String args[]) {
        int x = 5;
        int y = 8;
        int sum = x + y; // tổng 2 số
        int difference = x - y; //hiệu 2 số
        int product = x * y; // tích 2 số
        double quotient = (double) x / (double) y; //chia 2 số
        int quotient2 = x / y; //chia lấy phần nguyên
        x = ++x; //tăng x lên 1 đơn vị
        y = --y; // giảm y xuống 1 đơn vị
        double p = x; //ép kiểu từ int sang double
        int q = (int) p; //ép kiểu từ double sang int

/*
        System.out.println("Tổng của x và y là: " + sum);
        System.out.println("Hiệu của x và y là: " + difference);
        System.out.println("Tích của x và y là: " + product);
        System.out.printf("Thương của x và y là: %.2f", quotient);
        System.out.println("Giá trị phần nguyên của phép chia x và y là: " + quotient2);
        System.out.println("Tăng x lên 1 đơn vị: " + x);
        System.out.println("Giảm y xuống 1 đơn vị: " + y);
        System.out.println("Giá trị của p: " + p);
        System.out.println("Giá trị của q: " + q);

 */     // Tính tổng 2 số bằng Scanner
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  // Read user input
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  // Read user input
        int Sum = num1+num2;
        System.out.println("Sum of 2 numbers: " + Sum);  // Output user input

        //so sánh lớn hơn, nhỏ hơn, bằng giữa 2 số
        int a = 3, b = 1, c = 4, d = 3;
        compare(a, b);
        compare(a, c);
        compare(a, d);
    }

    public static void compare(int a, int b) {
        if (a > b)
            System.out.println(a + " lớn hơn " + b);
        else if (a < b)
            System.out.println(a + " nhỏ hơn " + b);
        else
            System.out.println(a + " bằng " + b);
    }
}
