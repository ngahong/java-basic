package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHomework {
    public static void main(String[] args) {
        int arr[] = {10, 15, 5, 20, 95, 30, 65};
        sum(arr);
        average(arr);
        evenOddNum(arr);
        maxMin(arr);
        multipleOfNum(10, arr);
        int arr3[] = {10, 15, 5, 20, 95, 30, 65};
        compare2Arrays(arr, arr3);

        int[][] arr1 = {{1, 2, 3}, {1, 1, 2}};
        int[][] arr2 = {{1, 1, 1}, {2, 2, 2}};
        add2arrays(arr1, arr2);
    }

    public static void sum(int arr[]) {
        String mess = "";
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = +arr[i];
        }
        mess = ("Sum of array is: " + sum);
        print(mess);
    }

    public static void average(int arr[]) {
        String mess = "";
        int sum = 0;
        double average;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = +arr[i];
        }
        average = (double) sum / (double) len;
        mess = ("Average of array is: " + average);
        print(mess);
    }

    public static void evenOddNum(int arr[]) {
        String messEven = "";
        String messOdd = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) messEven = messEven + arr[i] + ", ";
            else messOdd = messOdd + arr[i] + ", ";
        }
        messEven = "Even numbers in array: " + messEven.substring(0, messEven.length() - 2);
        messOdd = "Odd numbers in array: " + messOdd.substring(0, messOdd.length() - 2);
        print(messEven);
        print(messOdd);
    }

    public static void maxMin(int arr[]) {
        String mess1 = "";
        String mess2 = "";
        int len = arr.length;
        int max = arr[0], min = arr[0];
        for (int i = 0; i < len; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        mess1 = "The greatest number in array is " + max;
        mess2 = "The smallest number in array is " + min;
        print(mess1);
        print(mess2);
    }

    public static void multipleOfNum(int n, int arr[]) {
        String mess = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % n == 0) count = count + 1;
        }
        mess = "The number of multiple of number " + n + " in array is: " + count;
        print(mess);
    }

    public static void compare2Arrays(int arr1[], int arr2[]) {
        String mess = "";
        if (Arrays.equals(arr1, arr2)) mess = "2 arrays are same";
        else mess = "2 arrays are not same";
        print(mess);
    }

    public static void compare2ArraysByForLoop(int arr1[], int arr2[]) {
        String mess = "";
        int count = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                if (arr1[i] == arr2[i]) {
                    count = count + 1;
                } else break;
            }
            if (count == len1) mess = "2 arrays are same";
            else mess = "2 arrays are not same";
        } else mess = "2 arrays are not same";
        print(mess);
    }

    public static void add2arrays(int firstMatrix[][], int secondMatrix[][]) {
        int columns, rows;
        rows = firstMatrix.length;
        columns = firstMatrix[0].length;
        int sum[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.printf("Sum of 2 matrices is: \n");
        for (int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void print(String mess) {
        System.out.println(mess);
    }

}
