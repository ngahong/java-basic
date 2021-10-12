package Day2;

public class numberDigits {
    public static void main(String[] args) {
        int count = 0, num = 7592;
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
