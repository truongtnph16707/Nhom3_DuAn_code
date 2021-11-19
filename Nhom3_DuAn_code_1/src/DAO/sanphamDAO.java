
package DAO;

import Model.sanphamModel;
import java.util.List;

public interface sanphamDAO {
    public List<sanphamModel> getAll();
    public sanphamModel insert(sanphamModel SP);
    public boolean  update(sanphamModel SP);
    public boolean  delete(String  MaSP);
    
}
