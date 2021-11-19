
package DAO;

import Model.khachhangModel;
import java.util.List;


public interface KhachhangDAO {
   public List<khachhangModel> getAll() ;//load dữ liệu
   public khachhangModel insert(khachhangModel KH); //thêm mới
   public boolean update(khachhangModel KH); //update mới
   public boolean delete(String  MaKH); //xóa theo mã
   
}
