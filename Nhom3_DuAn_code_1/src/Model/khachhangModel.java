
package Model;

public class khachhangModel {
    private String MaKH,TenKh,SDT,DiaChi;

    public khachhangModel() {
    }

    public khachhangModel(String MaKH, String TenKh, String SDT, String DiaChi) {
        this.MaKH = MaKH;
        this.TenKh = TenKh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    
            
}
