public class buoi1_OOP {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Tèo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Tèo",9.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //thay đổi tên sv4
        sv4.setHoTen("BLACK");
        sv4.setDiem(25.0);
        sv4.hienThiThongTin();
        double dtbsv4 = sv4.tinhDTB(8,9);
        System.out.println(dtbsv4);
        sv4.hienThiThongTin();
        //toString
        System.out.println(sv4);
        //support method và vervice method
        sv4.checkHopLeDiem();
    }
}
