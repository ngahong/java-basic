package Day1;

import java.util.Locale;

public class Exe3 {
    public static void main(String args[]) {
        String name = "Nguyen Thi Hong Nga";
        String address = "Ha noi";
        int age = 20;
        System.out.println(name); //xuất chuỗi ra màn hình
        System.out.println("'" + name + "'"); // in chuỗi có dấu nháy đơn
        System.out.println(name.length()); // tìm độ dài của chuỗi
        System.out.println(name.toUpperCase()); //chuyển đổi ký tự thành chữ in hoa
        System.out.println(name.toLowerCase()); //chuyển đổi ký tự thành chữ in thường
        System.out.println(name + ". " + address);// Cộng 2 chuỗi lại với nhau
        System.out.println(name + ". " + age + "years old");// Cộng chuỗi với số
        checkKey("Nga", name); //kiểm tra từ khóa có trong chuỗi
        checkKey("Mai", name); //kiểm tra từ khóa không có trong chuỗi
    }

    public static void checkKey(String key, String text) {
        String mes = "";
        if (text.contains(key))
            mes = "String " + text + " contains the keyword " + key;
        else mes = "String " + text + " does not contains the keyword " + key;
        System.out.println(mes);
    }
}
