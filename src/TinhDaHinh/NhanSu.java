package TinhDaHinh;

public abstract class NhanSu {
    private String name;
    private String cccd;
    private String que;

    public NhanSu(String name, String que, String cccd) {
        this.name = name;
        this.que = que;
        this.cccd = cccd;
    }

    public NhanSu(String name, String cccd) {
        this.name = name;
        this.cccd = cccd;
    }

    public NhanSu() {
    }
    //phương thức tính lương
    public abstract double tinhLuong(int ngayCong);

    public String getName() {
        return name;
    }

    public String getQue() {
        return que;
    }

    public String getCccd() {
        return cccd;
    }
}
