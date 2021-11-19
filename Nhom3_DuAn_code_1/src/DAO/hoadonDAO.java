/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.hoadonModel;
import java.util.List;

public interface hoadonDAO {
    public List<hoadonModel> getAll();
    public hoadonModel insert(hoadonModel hoadon);
    public boolean update(hoadonModel hoadon);
    public boolean delete(String MAHD);
}
