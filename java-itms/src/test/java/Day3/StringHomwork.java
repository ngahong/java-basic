package Day3;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class StringHomwork {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "My name is Nga";
        String a = "hello hello";

        //reveresString(str1);
        countRepeatChar(a);
        //swap2Strings(str1, str2);
        //isPalindromeStr("AbcdcbA");
    }

    public static void compare2Strings(String str1, String str2) {
        String mess = "";
        if (str1.equalsIgnoreCase(str2))
            mess = "String " + str1 + " matches " + str2;
        else
            mess = "String " + str1 + " does not matches " + str2;
        print(mess);
    }

    public static void concat2String2(String str1, String str2) {
        String mess = "";
        mess = str1.concat(str2);
        print(mess);
    }

    public static void getLengthOfString(String str) {
        String mess = "";
        int lengthStr;
        lengthStr = str.length();
        mess = "The length of string is: " + lengthStr;
        print(mess);
    }

    public static void getSubstring(String str, int beginIndex, int endIndex) {
        String subString = "";
        String mess = "";
        if (str.equalsIgnoreCase(null) || str.equalsIgnoreCase(""))
            mess = "Check the string again";
        else {
            subString = str.substring(beginIndex, endIndex);
            mess = "The substring of string " + str + "is: " + subString;
        }
        print(mess);
    }

    public static void convertToUpperCase(String str) {
        String mess = "";
        mess = "String after convert to uppercase: " + str.toUpperCase();
        print(mess);
    }

    public static void convertToLowerCase(String str) {
        String mess = "";
        mess = "String after convert to lowercase: " + str.toLowerCase();
        print(mess);
    }

    public static void reveresString(String str) {
        String mess = "";
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        // Store result in reverse order into the result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        mess = "String after revers: " + (new String(result));

        print(mess);
    }

    public static void countRepeatChar(String str) {
        String mess = "";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();
        int len = str.length();
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else map.put(ch, 1);

        }
        Set<Character> keys = map.keySet(); //lấy key ra
        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                mess = "Character " + ch + " in string " + str + " repeats " + map.get(ch) + " times";
                print(mess);
            }
        }



    }

    public static void convertIntToStr(int number) {
        String mess = "";
        mess = Integer.toString(number);
        print(mess);
    }

    public static void swap2Strings(String str1, String str2) {
        String temp = "";
        temp = str1;
        str1 = str2;
        str2 = temp;
        print(str1);
        print(str2);
    }

    public static void isPalindromeStr(String str) {
        String mess = "";
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if(reverseStr.equalsIgnoreCase(str))
            mess = "String " + str + " is Palindrome";
        else
            mess = "String " + str + " is not Palindrome";
        print(mess);
    }

    public static void print(String mess) {
        System.out.println(mess);
    }
}
