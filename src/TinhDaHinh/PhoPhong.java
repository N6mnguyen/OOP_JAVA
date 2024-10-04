package TinhDaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String name, String que,String cccd) {
        super(name, que, cccd);
    }

    public PhoPhong(String name, String cccd) {
        super(name, cccd);
    }

    public PhoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40*ngayCong;

    }
}
