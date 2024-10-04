import java.util.Scanner;

public class bai11ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tổng 2 số ");
        float tong = sc.nextFloat();
        System.out.println("nhập hiệu 2 số");
        float hieu = sc.nextFloat();
        float x = (tong+hieu)/2;
        float y = tong - x;
        System.out.println("gias trị cần tìm = " +x);
        System.out.println("gias trị cần tìm = " +y);
    }
}