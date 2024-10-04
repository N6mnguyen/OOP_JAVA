import java.util.Scanner;

public class bai20vandungstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        /*  1. tach thanh arr phan tach boi khoang trang
            2. kiem tra trong mang dau la so
        */
        String[] arrString = str1.split(" ");
        for(int i=0; i<arrString.length; i++){
            try{
                int a = Integer.parseInt(arrString[i]);
                sum += a;
            }
            catch (Exception ex){
                System.out.println(arrString[i] + " cannot convert to integer");
            }
        }
        System.out.println("tong diem la: "+sum);
        double dtb = (double) sum/4;
        System.out.println("diem trung binh la: "+dtb);
    }
    }