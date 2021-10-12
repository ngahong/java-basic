package Day1;

public class sum100PrimeNumbers {
    public static void main(String[] args) {
        int n, sum = 0, count = 0;
        for (n = 0; ; n++) {
            if (prime(n) == 1) {
                sum = sum + n;
                count++;
            }
            if (count == 100) break;
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    public static int prime(int num) {
        int res = 0;
        if (num == 0 || num == 1) res = 0;
        else if (num == 2) res = 1;
        else if (num > 2) {
            for (int i = 2; i < (num - 1); i++) {
                if (num % i == 0) res = 0;
                else res = 1;
            }
        }
        return res;
    };
}
