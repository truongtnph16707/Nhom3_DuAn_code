
package DAO;

import Model.taikhoanModel;
import java.util.List;

public interface taikhoanDAO {
    public List<taikhoanModel> getAll();
    public taikhoanModel insert(taikhoanModel TK);
    public boolean update(taikhoanModel Tk);
    public boolean delete(String USERNAME);
}
