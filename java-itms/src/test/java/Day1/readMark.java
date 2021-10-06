package Day1;

public class readMark {
    public static void main(String args[]) {

        double[] number = {-1, 0, 3.4, 3.5, 3.6, 4.9, 5, 5.1, 6.4, 6.5, 7.9, 8, 8.1, 9.9, 10, 10.1, 11};

        for (int i = 0; i < number.length; i++) {
            readNumber(number[i]);
        }

/*
// sử dụng if else

    if(mark>=0&&mark<=10) {
            if(mark>=0&&mark<3.5)
                System.out.println("Kém " + mark);
            if(mark>=3.5&&mark<5)
                System.out.println("Yếu " + mark);
            if(mark>=5&&mark<6.5)
                System.out.println("Trung bình " + mark);
            if(mark>=6.5&&mark<8)
                System.out.println("Khá " + mark);
            if(mark>=8&&mark<=10)
                System.out.println("Giỏi " + mark);
    }
    else System.out.println("Không tồn tại điểm " + mark);
*/

/*
// Sử dụng if
        if(mark<0||mark>10)
            System.out.println("Không tồn tại điểm " + mark);
        if(mark>=0&&mark<3.5)
            System.out.println("Kém " + mark);
        if(mark>=3.5&&mark<5)
            System.out.println("Yếu " + mark);
        if(mark>=5&&mark<6.5)
            System.out.println("Trung bình " + mark);
        if(mark>=6.5&&mark<8)
            System.out.println("Khá " + mark);
        if(mark>=8&&mark<=10)
            System.out.println("Giỏi " + mark);
*/
    }

    public static void readNumber(double mark) {
        if (mark >= 0 && mark <= 10) {
            if (mark >= 0 && mark < 3.5)
                System.out.println("Kém " + mark);
            if (mark >= 3.5 && mark < 5)
                System.out.println("Yếu " + mark);
            if (mark >= 5 && mark < 6.5)
                System.out.println("Trung bình " + mark);
            if (mark >= 6.5 && mark < 8)
                System.out.println("Khá " + mark);
            if (mark >= 8 && mark <= 10)
                System.out.println("Giỏi " + mark);
        } else System.out.println("Không tồn tại điểm " + mark);
    }
}
