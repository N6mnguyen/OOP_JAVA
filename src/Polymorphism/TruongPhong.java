package TinhDaHinh;

public class TruongPhong extends NhanSu {
    public TruongPhong(String name, String que, String cccd) {
        super(name, que, cccd);
    }
    public TruongPhong(String name, String cccd) {
        super(name, cccd);
    }
    public TruongPhong() {
    }
    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong;
    }
}
