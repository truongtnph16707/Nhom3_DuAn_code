
package Sevices;

import DAO.hdctDAO;
import Model.hdctModel;
import Model.hoadonModel;
import Utils.helper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class hoadonchitietSevices implements hdctDAO{

    @Override
    public List<hdctModel> getAll() {
        List<hdctModel> lstHDCT = new ArrayList<>();
        try {
            String sql = "select * from hoadonct";
            PreparedStatement pstm = helper.prepare(sql);
            ResultSet rs = pstm.executeQuery();
            while (true) {                
                String mahd = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                int soluong = rs.getInt(4);
                float dongia = rs.getFloat(5);
                
                hdctModel hdct = new hdctModel(mahd, masp, tensp, soluong, dongia);
                lstHDCT.add(hdct);
            }
        } catch (Exception e) {
        }
        return lstHDCT;
    }

    @Override
    public hdctModel insert(hdctModel HDCT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(hdctModel HDCT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String MaHD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
