
package test18;

public class My_Dream {
    private String HoTen;
    private double NgaySinh;
    private int ThuNhap;

    public My_Dream() {
    }

    public My_Dream(String HoTen, double NgaySinh, int ThuNhap) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.ThuNhap = ThuNhap;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(double NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getThuNhap() {
        return ThuNhap;
    }

    public void setThuNhap(int ThuNhap) {
        this.ThuNhap = ThuNhap;
    }

    @Override
    public String toString() {
        return "My_Dream{" + "HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", ThuNhap=" + ThuNhap + '}';
    }
    
    
}
