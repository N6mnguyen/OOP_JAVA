import java.util.Scanner;

public class bai14while {
    public static void main(String[] args) {
        // int a = 0;
        // while (a<=5) {
        //     System.out.println("a = "+a);
        //     a++;
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao so nguyen tu 1 den 99");
        int a = sc.nextInt();
        while (a<=1||a<=99) {
            System.out.println("moi nhap lai");
            a = sc.nextInt();
        }
        System.out.println("ban da nhap xong "+a);
    }
}
