
package Lab5_2;

import java.io.Serializable;

public class Phim implements Serializable{
    private String hoTen;
    private int namSinh;
    private String theLoai;
    private String hinhThucXem;
    private String phimKinhDien;

    public Phim() {
    }

    public Phim(String hoTen, int namSinh, String theLoai, String hinhThucXem, String phimKinhDien) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.theLoai = theLoai;
        this.hinhThucXem = hinhThucXem;
        this.phimKinhDien = phimKinhDien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getHinhThucXem() {
        return hinhThucXem;
    }

    public void setHinhThucXem(String hinhThucXem) {
        this.hinhThucXem = hinhThucXem;
    }

    public String getPhimKinhDien() {
        return phimKinhDien;
    }

    public void setPhimKinhDien(String phimKinhDien) {
        this.phimKinhDien = phimKinhDien;
    }
    
    public String tinhCach(){
        if(theLoai.equalsIgnoreCase("Hành động")){
            return "Mạnh mẽ";
        }else if(theLoai.equalsIgnoreCase("Hài")){
          return "Vui vẻ" ; 
        }else{
            return "Tình cảm";
        }
    }

    @Override
    public String toString() {
        return "Phim{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", theLoai=" + theLoai + ", hinhThucXem=" + hinhThucXem + ", phimKinhDien=" + phimKinhDien + '}';
    }
    
    
}
