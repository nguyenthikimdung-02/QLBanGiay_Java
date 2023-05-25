/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import DTO.Giay;
import DTO.KhachHang;
import DTO.NCC;
import DTO.NSX;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class ExecuteData {
    // <editor-fold defaultstate="collapsed" desc="Giay"> 
    public static boolean insertGiay(Giay giay)
    {
        String temp = String.format("Insert into KimDung.GIAY (MAGIAY,TENGIAY,GIABAN,SLTON,MANSX,HINHANH) values ('%s','%s',%s,%s)",giay.getMaGiay(),giay.getTenGiay(),giay.getGiaBan(),giay.getNSX());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateGiay(Giay giay)
    {
        String temp = String.format("Update KimDung.GIAY set MAGIAY = '%s', TENGIAY = '%s', GIABAN = %s, MANSX = '%s' where MAGIAY = '%s'",giay.getMaGiay(),giay.getTenGiay(),giay.getGiaBan(),giay.getNSX(),giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteGiay(Giay giay)
    {
        String temp = String.format("delete from KimDung.GIAY where MAGIAY = '%s'",giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="NCC"> 
    public static boolean insertNCC(NCC ncc)
    {
        String temp = String.format("Insert into KimDung.NCC (MANCC,TENNCC) values ('%s','%s')",ncc.getMaNCC(),ncc.getTenNCC());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateNCC(NCC ncc)
    {
        String temp = String.format("Update KimDung.NCC set MANCC = '%s', TENNCC = '%s' where MANCC = '%s'",ncc.getMaNCC(),ncc.getTenNCC(),ncc.getMaNCC());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteNCC(NCC ncc)
    {
        String temp = String.format("delete from KimDung.NCC where MANCC = '%s'",ncc.getMaNCC());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="NSX"> 
    public static boolean insertNSX(NSX nsx)
    {
        String temp = String.format("Insert into KimDung.NSX (MANSX,TENNSX) values ('%s','%s')",nsx.getMaNSX(),nsx.getTenNSX());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateNSX(NSX nsx)
    {
        String temp = String.format("Update KimDung.NSX set MANSX = '%s', TENNSX = '%s' where MANSX = '%s'",nsx.getMaNSX(),nsx.getTenNSX(),nsx.getMaNSX());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteNSX(NSX nsx)
    {
        String temp = String.format("delete from KimDung.NSX where MANSX = '%s'",nsx.getMaNSX());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="KhachHang"> 
    public static boolean insertKH(KhachHang kh)
    {
        String temp = String.format("Insert into KimDung.KHACHHANG (MAKH,TENKH,DIACHI,NGAYSINH) values ('%s','%s','%s','%s')",kh.getMaKH(),kh.getTenKH(),kh.getDiaChi(),kh.getNgaySinh().toString());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateKH(KhachHang kh)
    {
        String temp = String.format("Update KimDung.NSX set MAKH = '%s', TENKH = '%s', DIACHI = '%s', NGAYSINH = '%s' where MAKH = '%s'",kh.getMaKH(),kh.getTenKH(),kh.getDiaChi(),kh.getNgaySinh().toString(),kh.getMaKH());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteKH(KhachHang kh)
    {
        String temp = String.format("delete from KimDung.KHACHHANG where MAKH = '%s'",kh.getMaKH());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    //</editor-fold>
}
