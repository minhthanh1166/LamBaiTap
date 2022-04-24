package product;

public class sinhvien {
    private String masv;
    private String hoten;
    private String tenkhoa;
    private String gioitinh;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public sinhvien(String masv, String hoten, String tenkhoa, String gioitinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.tenkhoa = tenkhoa;
        this.gioitinh = gioitinh;
    }

}
