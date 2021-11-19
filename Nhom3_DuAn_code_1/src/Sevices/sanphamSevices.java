
package Sevices;

import DAO.sanphamDAO;
import Model.sanphamModel;
import Utils.helper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class sanphamSevices implements sanphamDAO{

    @Override
    public List<sanphamModel> getAll() {
        List<sanphamModel> lstSP = new ArrayList<>();
        try {
            String sql = "select * from sanpham";
            PreparedStatement pstm = helper.prepare(sql);
            ResultSet rs = pstm.executeQuery();
            while (true) {                
                String MaSP = rs.getString(1);
                String TenSP = rs.getString(2);
                String HinhAnh = rs.getString(3);
                int SOLUONG = rs.getInt(4);
                float dongia = rs.getFloat(5);
                String Mota = rs.getString(6);
                String MaTheLoai = rs.getString(7);
                
                sanphamModel SP = new sanphamModel(MaSP, TenSP, HinhAnh, Mota, MaTheLoai, SOLUONG, dongia);
                lstSP.add(SP);     
            }
        } catch (Exception e) {
        }
        return lstSP;   
    }

    @Override
    public sanphamModel insert(sanphamModel SP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(sanphamModel SP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String MaSP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
}
