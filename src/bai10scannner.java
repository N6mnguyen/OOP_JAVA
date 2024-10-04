import java.util.Scanner;

public class bai10scannner {
    public static void main(String[]args){
        //khởi tạo đối tượng
        Scanner  a =  new Scanner(System.in);
        //cho phép nhập chuỗi
        System.out.println("mời bạn nhập mật khẩu:");
        String mk  = a.nextLine();
        System.out.println("mật khẩu " + mk);
        int mk2 = a .nextInt();
        System.out.println("mời nhập số nguyên" +mk2);
    }
}
