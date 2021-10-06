package Day1;

import java.util.Random;

public class Exe4 {
    public static void main(String args[]) {
        int a = 5;
        int square = a * a; // bình phương số a
        System.out.println(square);

        int b = -10;
        int c = -1 * b; //chuyển số âm thành số dương
        System.out.println(c);

        Random rand = new Random(); //instance of random class
        int upperbound = 2;//generate random values from 0-1
        int int_random = rand.nextInt(upperbound); // tạo số ngẫu nhiên kiểu integer trong khoảng từ 0 đến 1
        System.out.println("Random integer value from 0 to " + (upperbound - 1) + " : " + int_random);

        double double_random = rand.nextDouble(); // tạo số ngẫu nhiên kiểu double trong khoảng 0 đến 1
        System.out.printf("Random double value between 0.0 and 1.0: %.2f", double_random);
    }
}
