
package Model;

public class hoadonModel {
    private String MAHD, MANV, MAKH, NGAYLAP;
    private Float TONGTIEN;

    public hoadonModel() {
    }

    public hoadonModel(String MAHD, String MANV, String MAKH, String NGAYLAP, Float TONGTIEN) {
        this.MAHD = MAHD;
        this.MANV = MANV;
        this.MAKH = MAKH;
        this.NGAYLAP = NGAYLAP;
        this.TONGTIEN = TONGTIEN;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getNGAYLAP() {
        return NGAYLAP;
    }

    public void setNGAYLAP(String NGAYLAP) {
        this.NGAYLAP = NGAYLAP;
    }

    public Float getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(Float TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }
    
    
}
