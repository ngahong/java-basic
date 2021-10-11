package Day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayStringHomework5 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 6, 10};
        int[] arr1 = {8, 9, 4, 11, 2, 15};
        String[] arr2 = {"abc", "def", "12345", "test", "java", "aaabb"};
        print(Boolean.toString(checkFirstLastElement(arr)));
        print(Boolean.toString(isSameElement(arr1)));
        print((Boolean.toString(checkElementOfArray(arr, arr1))));
        print(Boolean.toString(checkNum(arr)));
        printArray(createArray(arr, arr1));
        printArray(rotateArray(arr1));
        print(Integer.toString(findMax(arr1)));
        printArray(swapArray(arr1));
        findLongestStringInArray(arr2);

        System.out.println("Enter number: ");
        int a = enterNumber();
        print(dayOfWeek(a));

        System.out.println("Enter number: ");
        int b = enterNumber();
        print(monthOfYear(b));

        System.out.println("Enter number: ");
        int c = enterNumber();
        print(Boolean.toString(isLeapYear(c)));

    }

    public static boolean checkFirstLastElement(int[] arr) {
        boolean res = false;
        int len = arr.length;
        if (len > 2) {
            for (int i = 0; i < len; i++) {
                if (arr[0] == 10 || arr[len - 1] == 10)
                    res = true;
            }
        }
        return res;
    }

    public static boolean isSameElement(int[] arr) {
        boolean res = false;
        int len = arr.length;
        if (len > 2) {
            for (int i = 0; i < len; i++) {
                if (arr[0] == arr[len - 1])
                    res = true;
            }
        }
        return res;
    }

    public static boolean checkElementOfArray(int[] arr1, int[] arr2) {
        boolean res = false;
        if (arr1[0] == arr2[arr2.length - 1])
            res = true;
        return res;
    }

    public static int[] createArray(int[] arr1, int[] arr2) {
        int[] res = new int[2];
        res[0] = arr1[0];
        res[1] = arr2[arr2.length - 1];
        return res;
    }

    public static boolean checkNum(int[] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 4 || arr[i] == 7) res = true;
        }
        return res;
    }

    public static int[] rotateArray(int[] arr) {
        int len = arr.length;
        int[] rotateArray = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            rotateArray[len - 1 - i] = arr[i];
        }
        return rotateArray;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        //    for (int i = 0; i < arr.length; i++) {
        //        if (arr[i] > max) max = arr[i];
        //    }
        if (arr[arr.length - 1] > max) max = arr[arr.length - 1];
        return max;
    }

    public static int[] swapArray(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        res[0] = arr[len - 1];
        res[len - 1] = arr[0];
        for (int i = 1; i < len - 1; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void findLongestStringInArray(String[] arr) {
        Map<String, Integer> stringMap = new HashMap<>();
        int len = arr.length;
        int max = arr[0].length();
        for (int i = 0; i < len; i++) {
            stringMap.put(arr[i], arr[i].length());
            if (arr[i].length() > max) max = arr[i].length();

        }
        for (int j = 0; j < len; j++){
            if (stringMap.get(arr[j]) == max)
                System.out.println(arr[j]);
        }
    }

    public static String dayOfWeek(int n) {
        String mess = "";
        switch (n) {
            case 1:
                mess = "Sunday";
                break;
            case 2:
                mess = "Monday";
                break;
            case 3:
                mess = "Tuesday";
                break;
            case 4:
                mess = "Wednesday";
                break;
            case 5:
                mess = "Thursday";
                break;
            case 6:
                mess = "Friday";
                break;
            case 7:
                mess = "Saturday";
                break;
            default:
                mess = "The number is not valid";
        }
        return mess;
    }

    public static String monthOfYear(int n) {
        String mess = "";
        switch (n) {
            case 1:
                mess = "January";
                break;
            case 2:
                mess = "February";
                break;
            case 3:
                mess = "March";
                break;
            case 4:
                mess = "April";
                break;
            case 5:
                mess = "May";
                break;
            case 6:
                mess = "June";
                break;
            case 7:
                mess = "July";
                break;
            case 8:
                mess = "August";
                break;
            case 9:
                mess = "September";
                break;
            case 10:
                mess = "October";
                break;
            case 11:
                mess = "November";
                break;
            case 12:
                mess = "December";
                break;
            default:
                mess = "The number is not valid";
        }
        return mess;
    }

    public static boolean isLeapYear(int n){
        boolean res = false;
        if(n>0 && n%4==0 && n%100!=0) res = true;
        return res;
    }

    public static int enterNumber() {
        int n = 0;
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            n = s.nextInt();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            n = 0;
        }
        return n;
    }

    public static void print(String res) {
        System.out.println(res);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
