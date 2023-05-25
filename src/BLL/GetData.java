/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class GetData {
    //lấy thông tin tất cả giày
    public ArrayList getDataGiay()
    {
        DataAccess da = new DataAccess("select * from KimDung.GIAY");
        return da.QueryTable();
    }
    public ArrayList getDataKhachHang() {
        DataAccess da = new DataAccess("SELECT * FROM KimDung.KHACHHANG");
        return da.QueryTable();
    }
    public ArrayList getDataKhachHang(String ma){
        DataAccess da = new DataAccess( String.format("select * from KHACHHANG where MAKH = '%s'", ma));
        return da.QueryTable();
    }
    public ArrayList getDataNV() {
        DataAccess da = new DataAccess("SELECT * FROM KimDung.NHANVIEN");
        return da.QueryTable();
    }
}
