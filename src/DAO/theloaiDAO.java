
package DAO;

import Model.theloaiModel;
import java.util.List;


public interface theloaiDAO {
    public List<theloaiModel> getAll();
    public theloaiModel insert(theloaiModel theloai);
    public boolean update(theloaiModel theloai);
    public boolean  delete(String matheloai);
}
