/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import DTO.CTKC;
import DTO.CTPN;
import DTO.Giay;
import DTO.KhachHang;
import DTO.NCC;
import DTO.NSX;
import DTO.NhanVien;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class ExecuteData {
    // <editor-fold defaultstate="collapsed" desc="Giay"> 
    public static boolean insertGiay(Giay giay)
    {
        String temp = String.format("Insert into KimDung.GIAY (MAGIAY,TENGIAY,GIABAN,MANSX) values ('%s','%s',%s,'%s')",giay.getMaGiay(),giay.getTenGiay(),giay.getGiaBan(),giay.getNSX());
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
        String temp = String.format("Update KimDung.KHACHHANG set MAKH = '%s', TENKH = '%s', DIACHI = '%s', NGAYSINH = '%s' where MAKH = '%s'",kh.getMaKH(),kh.getTenKH(),kh.getDiaChi(),kh.getNgaySinh().toString(),kh.getMaKH());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteKH(KhachHang kh)
    {
        String temp = String.format("delete from KimDung.KHACHHANG where MAKH = '%s'",kh.getMaKH());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="NhanVien"> 
    public static boolean insertNV(NhanVien nv)
    {
        String temp = String.format("Insert into KimDung.NHANVIEN (MANV,TENNV,NGAYSINH,GIOITINH,DIACHI,LUONG,NGAYVAOLAM) values ('%s','%s','%s','%s','%s',%s,'%s')",nv.getMaNV(),nv.getTenNV(),nv.getNgaySinh().toString(),nv.getGioiTinh(),nv.getDiaChi(),nv.getLuong(),nv.getNgayVaoLam().toString());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateNV(NhanVien nv)
    {
        String temp = String.format("Update KimDung.NHANVIEN set MANV = '%s', TENNV = '%s', NGAYSINH = '%s', GIOITINH = '%s', DIACHI = '%s',LUONG = %s,NGAYVAOLAM = '%s' where MANV = '%s'",nv.getMaNV(),nv.getTenNV(),nv.getNgaySinh().toString(),nv.getGioiTinh(),nv.getDiaChi(),nv.getLuong(),nv.getNgayVaoLam().toString(),nv.getMaNV());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteNV(NhanVien nv)
    {
        String temp = String.format("delete from KimDung.NHANVIEN where MANV = '%s'",nv.getMaNV());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="CTKC"> 
    public static boolean insertCTKC(CTKC ct)
    {
        String temp = String.format("Insert into KimDung.CTKC (KICHCO,MAGIAY,SOLUONG) values ('%s','%s',%s)",ct.getSize(),ct.getMaGiay(),ct.getSL());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateCTKC(CTKC ct)
    {
        String temp = String.format("Update KimDung.CTKC set KICHCO = '%s', MAGIAY = '%s',SOLUONG=%s where KICHCO = '%s'",ct.getSize(),ct.getMaGiay(),ct.getSL(),ct.getSize());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteCTKC(CTKC ct)
    {
        String temp = String.format("delete from KimDung.CTKC where KICHCO = '%s' and MAGIAY = '%s'",ct.getSize(),ct.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="CTPN"> 
    public static boolean insertCTPN(CTPN ct)
    {
        String temp = String.format("Insert into KimDung.CTPN (MAPN,MAGIAY,NGAYNHAP,KICHCO,SL,GIANHAP,MANSX,MANCC) values ('%s','%s','%s','%s',%s,%s,'%s','%s')",ct.getMaPhieu(),ct.getMaGiay(),ct.getNgayNhap(),ct.getSize(),ct.getSL(),ct.getGiaNhap(),ct.getMaNSX(),ct.getMaNCC());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateCTPN(CTPN ct)
    {
        String temp = String.format("Update KimDung.CTPN set MAPN = '%s', MAGIAY = '%s',NGAYNHAP = '%s',KICHCO='%s',SL= %s,GIANHAP= %s,MANSX = '%s', MANCC = '%s' where MAPN = '%s'",ct.getMaPhieu(),ct.getMaGiay(),ct.getNgayNhap(),ct.getSize(),ct.getSL(),ct.getGiaNhap(),ct.getMaNSX(),ct.getMaNCC(),ct.getMaPhieu());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteCTPN(CTPN ct)
    {
        String temp = String.format("delete from KimDung.CTPN where MAPN = '%s' and MAGIAY = '%s'",ct.getMaPhieu(),ct.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
}
