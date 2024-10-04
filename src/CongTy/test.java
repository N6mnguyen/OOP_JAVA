package CongTy;

public class test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("nhân viên 1","Bắc Ninh",800);
        double luongnv1  = nv1.tinhLuong();
        System.out.println("lương cơ bản là "+luongnv1);
        //tạo đối tượng hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1","Thái Nguyên",3333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("lương Hành Chính 1 "+luonghc1);
        //tạo đối tượng đi cả
        NhanVienDiCa ca1 = new NhanVienDiCa("Nguyễn Văn Nam","Hà Nội",2004);
        double luongdc1 = ca1.tinhLuong();
        System.out.println("Lượng Đi Cả 1 "+luongdc1);
        NhanVienDiCa ca2 = new NhanVienDiCa("Nguyễn Văn Nam","Hà Nội",2004,1);
        double luongdc2 = ca2.tinhLuong();
        System.out.println("Lượng Đi Cả 2 "+luongdc2);
        System.out.println(ca2.ca);
    }
}
