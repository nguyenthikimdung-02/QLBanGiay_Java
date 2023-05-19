/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import DTO.Giay;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class ExecuteData {
    // <editor-fold defaultstate="collapsed" desc="Giay"> 
    public static boolean insertGiay(Giay giay)
    {
        String temp = String.format("Insert into USER1.GIAY (MAGIAY,TENGIAY,GIABAN,SLTON,MANSX,HINHANH) values ('%s','%s',%s,%s,'%s','%s')",giay.getMaGiay(),giay.getTenGiay(),giay.getGiaBan(),giay.getSLTon(),giay.getNSX(),giay.getImage());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateGiay(Giay giay)
    {
        String temp = String.format("Update USER1.GIAY set MAGIAY = '%s', TENGIAY = '%s', GIABAN = %s, SLTON = %s, MANSX = '%s', HINHANH = '%s' where MAGIAY = '%s'",giay.getMaGiay(),giay.getTenGiay(),giay.getGiaBan(),giay.getSLTon(),giay.getNSX(),giay.getImage(),giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteGiay(Giay giay)
    {
        String temp = String.format("delete from USER1.GIAY where MAGIAY = '%s'",giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="NCC"> 
    public static boolean insertNCC(Giay giay)
    {
        String temp = String.format("Insert into USER1.NCC (MANCC,TENNCC) values ('%s','%s')",giay.getMaGiay(),giay.getTenGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateNCC(Giay giay)
    {
        String temp = String.format("Update USER1.NCC set MANCC = '%s', TENNCC = '%s' where MANCC = '%s'",giay.getMaGiay(),giay.getTenGiay(),giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteNCC(Giay giay)
    {
        String temp = String.format("delete from USER1.NCC where MANCC = '%s'",giay.getMaGiay());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    //</editor-fold> 
}
