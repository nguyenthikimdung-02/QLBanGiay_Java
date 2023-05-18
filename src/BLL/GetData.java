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
        DataAccess da = new DataAccess("select * from USER1.GIAY");
        return da.QueryTable();
    }
}
