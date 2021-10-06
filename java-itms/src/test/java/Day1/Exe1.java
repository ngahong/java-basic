package Day1;

public class Exe1 {
    public static void main(String args[]) {
        String text; // tạo biến kiểu string
        int x;// tạo biến kiểu integer
        // tạo biến mà không gán giá trị, sau đó gán giá trị vào
        double a;
        a = 9.9;
        System.out.println("a= " + a);
        // Thay đổi giá trị của biến
        int b = 5;
        b = 10;
        System.out.println("b= " + b);
        //	Tạo biến chỉ cho phép đọc và không cho thay đổi giá trị
        final int c = 20;
        //	Tạo biến kết hợp từ các biến khác nhau
        int p = 10, q = 40;
        int res = p + q;
        System.out.println("res= " + res);
        //	Khai báo nhiều biến cùng kiểu dữ liệu
        double num1 = 9, num2 = 10;
        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);
    }
}
