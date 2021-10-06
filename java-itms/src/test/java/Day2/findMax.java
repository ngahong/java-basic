package Day2;

public class findMax {
    public static void main(String args[]) {
        int a = 4, b = 10, c = 8;
        findMaxNum(a, b, c);
    }

    public static void findMaxNum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The greatest number is " + max);
    }
}
