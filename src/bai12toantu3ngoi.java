import java.util.Scanner;

public class bai12toantu3ngoi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số: ");
        int a  = sc.nextInt();
        String traLoi = (a%2==0)?"chẵn": "lẻ";
        System.out.println("số đó là" +traLoi);
    }
}
