package Day1;

import java.util.Scanner;

public class convertTitleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = scanner.nextLine();
        toTitleCase(str);
    }

    public static void toTitleCase(String givenString) {
        String res = "";
        String[] words = givenString.split(" ");
        for (int i = 0; i < words.length; i++) {
            res = res + Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
        }
        System.out.println(res.trim());
    }
}
