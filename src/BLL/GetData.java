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
    public ArrayList getDataNV(String ma) {
        DataAccess da = new DataAccess(String.format("SELECT * FROM KimDung.NHANVIEN where MANV = '%s'",ma));
        return da.QueryTable();
    }
    public ArrayList getDataCTPN() {
        DataAccess da = new DataAccess("SELECT * FROM KimDung.CTPN");
        return da.QueryTable();
    }
    public Object[][] getAllManufacturerName() {
        DataAccess da = new DataAccess(
                "SELECT MaNSX from KimDung.NSX");
        return da.QueryContentTable();
    }
    public Object[][] getAllSupplierName() {
        DataAccess da = new DataAccess(
                "SELECT MaNCC from KimDung.NCC");
        return da.QueryContentTable();
    }
    public Object[][] getAllSize() {
        DataAccess da = new DataAccess(
                "SELECT KichCo from KimDung.KichCo");
        return da.QueryContentTable();
    }
    public ArrayList getDataNCC(){
        DataAccess da = new DataAccess("SELECT * FROM KimDung.NCC");
        return da.QueryTable();
    }
    public ArrayList getDataNCC(String ma){
        DataAccess da = new DataAccess(String.format("select * from KimDung.NCC where MANCC='%s'", ma ));
        return da.QueryTable();
    }
    public ArrayList getDataCTHD()
    {
        DataAccess da = new DataAccess("select * from KimDung.CTHD");
        return da.QueryTable();
    }
    public ArrayList getDataCTHD_DK(String ma)
    {
        DataAccess da = new DataAccess(String.format("select * from KimDung.CTHD where MAHD='%s'",ma));
        return da.QueryTable();
    }
    public Object[][] getMaNV(String ma) {
        DataAccess da = new DataAccess(
                String.format("SELECT MANV from KimDung.NHANVIEN where TENID = '%s'",ma));
        return da.QueryContentTable();
    }
    public Object[][] getTongTien(String ma) {
        DataAccess da = new DataAccess(
                String.format("select sum(SL*DONGIA) as tong from KimDung.CTHD where MAHD='%s'",ma));
        return da.QueryContentTable();
    }
    public Object[][] getTotalSize(String kc,String ma) {
        DataAccess da = new DataAccess(
                String.format("select SOLUONG from KimDung.CTKC where KichCo = '%s' and MaGiay = '%s'",kc,ma));
        return da.QueryContentTable();
    }
}
