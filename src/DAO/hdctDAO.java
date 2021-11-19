
package DAO;

import Model.hdctModel;
import java.util.List;


public interface hdctDAO {
    public List<hdctModel> getAll();
    public hdctModel insert(hdctModel HDCT);
    public boolean update(hdctModel HDCT);
    public boolean delete(String MaHD);
}
