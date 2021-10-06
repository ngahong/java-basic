package Day1;

public class FirstClass {
    public static void main(String args[]) {
        int x = 5;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        //swap(x,y);

    }

    public static void swap(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }

}
