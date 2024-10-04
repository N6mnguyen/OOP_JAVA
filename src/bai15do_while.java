public class bai15do_while {
    public static void main(String[] args){
        int a = 1;
        int tong = 0;
            do {
                tong+=a;
                a++;
            }
            while (a<=6);
            System.out.println("tổng= " +tong);
        }
    }

