
package Model;

public class sanphamModel {
    private String MaSp,TenSP,HinhAnh,Mota,MaTheLoai;
    private int SOLUONG;
    private float dongia;

    public sanphamModel() {
    }

    public sanphamModel(String MaSp, String TenSP, String HinhAnh, String Mota, String MaTheLoai, int SOLUONG, float dongia) {
        this.MaSp = MaSp;
        this.TenSP = TenSP;
        this.HinhAnh = HinhAnh;
        this.Mota = Mota;
        this.MaTheLoai = MaTheLoai;
        this.SOLUONG = SOLUONG;
        this.dongia = dongia;
    }

    

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String MaSp) {
        this.MaSp = MaSp;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
}
