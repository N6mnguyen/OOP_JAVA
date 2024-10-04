public class bai17_breakcontinue {
    public static void main(String[] args){
        //tính tổng đến 5 bỏ qua số 3
        int tong =0;
        for (int i = 10; i <= 50; i++) {
              if(i%3==0)
          {
              System.out.println(i);
          }
          else {
            continue;
          }
        }
    }
}
