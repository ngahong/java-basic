package Day1;

public class checkDivisible {
    public static void main(String[] args) {
        String mess3 = "", mess5 = "", mess = "";
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) mess3 = mess3 + n + ", ";
            if (n % 5 == 0) mess5 = mess5 + n + ", ";
            if (n % 3 == 0 && n % 5 == 0) mess = mess + n + ", ";
        }
        //mess=mess.substring(0, mess.length()-1);
        System.out.println("Divided by 3: \n" + removeLastChar(mess3));
        System.out.println("Divided by 5: \n" + removeLastChar(mess5));
        System.out.println("Divided by 3 & 5: \n" + removeLastChar(mess));
    }

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 2);
    }
}
