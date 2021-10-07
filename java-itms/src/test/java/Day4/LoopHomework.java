package Day4;

public class LoopHomework {
    public static void main(String[] args) {
        forLoop();
        print(doWhileLoop());
        print(doubleForLoop());
        print(forLoopContinue());
        print(doWhileLoopContinue());
        print(whileLoopContinue());
    }

    public static void forLoop() {
        for (int i = 1; i <= 20; i++) {
            print(i);
            if (i == 8) break;
        }
    }

    public static int doWhileLoop() {
        int num = 1, sum = 0;
        do {
            sum = sum + num;
            num++;
            if (num == 80) break;
        } while (num <= 100);
        return sum;
    }

    public static int doubleForLoop() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 30; j++) {
                sum = sum + j;
                if (j == 4) break;
            }
        }
        return sum;
    }

    public static int forLoopContinue() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum = sum + i;
            if (i == 5) continue;
        }
        return sum;
    }

    public static int doWhileLoopContinue() {
        int n = 1, sum = 0;
        do {
            sum = sum + n;
            n++;
            if (n == 5) continue;
        } while (n <= 10);
        return sum;
    }

    public static int whileLoopContinue() {
        int n = 1, sum = 0;
        while (n <= 10) {
            sum = sum + n;
            n++;
            if (n == 5) continue;
        }
        return sum;
    }

    public static void print(int value) {
        System.out.println(value);
    }
}
