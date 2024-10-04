package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("name","quê","2022");
        //xuất lương phó phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.println("NN ĐANG LÀM PHÓ PHÒNG");
        System.out.println(ns1.getName()+":"+ns1.getCccd());
         //thay đổi chức vụ
        ns1 = new TruongPhong(ns1.getName(), ns1.getQue(), ns1.getCccd());
        //tính tiền lương
        System.out.println("NN ĐANG LÀM TRƯỞNG PHÒNG");
        System.out.println(ns1.getName()+":"+ns1.getCccd()+ns1.getQue());
        System.out.println(ns1.tinhLuong(21));
    }
}
