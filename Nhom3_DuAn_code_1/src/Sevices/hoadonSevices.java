
package Sevices;




import DAO.hoadonDAO;
import Model.hoadonModel;
import Utils.helper;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class hoadonSevices implements hoadonDAO{

    @Override
    public List<hoadonModel> getAll() {
        List<hoadonModel> lstHD = new ArrayList<>();
        try {
            String sql = "select * from hoadon";
            PreparedStatement pstm = helper.prepare(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                String MaHD = rs.getString(1);
                String MANV = rs.getString(2);
                String MAKH = rs.getString(3);
                String NGAYLAP = rs.getString(4);
                float TONGTIEN = rs.getFloat(5);
                
                hoadonModel hoadon = new hoadonModel(MaHD, MANV, MANV, MANV, TONGTIEN);
                lstHD.add(hoadon);
            }
        } catch (Exception e) {
        }
        return lstHD;
    }

    @Override
    public hoadonModel insert(hoadonModel hoadon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(hoadonModel hoadon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String MAHD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  
}
