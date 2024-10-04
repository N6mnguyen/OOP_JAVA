package Encapsulation;

public class test {
    public static void main(String[] args) {
        Products test = new Products();

        Products pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println(" tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }

}
