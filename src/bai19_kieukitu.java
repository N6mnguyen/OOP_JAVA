import java.util.Scanner;

public class bai19_kieukitu {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 66;
        System.out.println("ch2");
        char ch3;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập");
        String s = sc.nextLine();
        char ch4 = s.charAt(1);
        System.out.println("ký tự vừa nhập"+ch4);
    }
}
