
package Sevices;

import DAO.KhachhangDAO;
import Model.khachhangModel;
import Utils.helper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class khachhangSevices implements KhachhangDAO{

    @Override
    public List<khachhangModel> getAll() {
        List<khachhangModel> lstKH= new ArrayList<>();
        try {
            String sql = "select * from khachhang";
            PreparedStatement pstm = helper.prepare(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                String MaKH = rs.getString(1);
                String TenKH = rs.getString(2);
                String SDT = rs.getString(3);
                String DiaChi = rs.getString(4);
                
                khachhangModel kh = new khachhangModel(MaKH, TenKH, SDT, DiaChi);
                lstKH.add(kh);
            }    
        } catch (Exception e) {
        }
        return lstKH;
    }

    @Override
    public khachhangModel insert(khachhangModel KH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(khachhangModel KH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String MaKH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
