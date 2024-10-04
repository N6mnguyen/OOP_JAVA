public class SinhVien {
private String hoTen;
private Double diem;
    public SinhVien(){
    hoTen = "no name";
    diem  = 25.0;
    }
    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }
    public SinhVien(String hoTen, Double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }
    public void hienThiThongTin()
    {
        System.out.println(hoTen+":"+diem);
    }
    public String getHoTen(){
        return hoTen;
    }
    public Double getDiem(){
        return diem;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //phương thức có kiểu trả về
    public double tinhDTB (double diemToan, double diemVan){
        return(diemToan+diemVan)/2;
    //toString
    }
    //support method
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //service method
    public void checkHopLeDiem(){
        if (checkDiem())
        {
            System.out.println("điểm hợp lý và tiếp tục nhập thông tin");
        }
        else
        {
            System.out.println("kiểm tra lại");
        }
    }
}

