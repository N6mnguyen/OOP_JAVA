import java.util.Scanner;

public class bai13switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập:");
        int a =  sc.nextInt();
        int div = a%2;
        switch (div)
        {
            case 0:
                System.out.println(a+"haha");
                break;
            case 1:
                System.out.println(a+"hihi");
                break;
            default:
                System.out.println(a+"huhu");
                break;
        }
    }
}
