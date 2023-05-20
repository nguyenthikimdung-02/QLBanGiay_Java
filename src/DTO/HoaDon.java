/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class HoaDon {
    private String mahd;
    private String magiay;
    private String manv;
    private Date ngayin;
    public HoaDon()
    {

    }
    public HoaDon(String mahd, String magiay, String manv, Date ngayin)
    {
        this.mahd = mahd;
        this.magiay = magiay;
        this.manv = manv;
        this.ngayin = ngayin;
    }
    public String getMaHD()
    {
        return mahd;
    }
    public void setMaHD(String mahd)
    {
        this.mahd = mahd;
    }
    public String getMaGiay()
    {
        return magiay;
    }
    public void setMaGiay(String magiay)
    {
        this.magiay = magiay;
    }
    public String getMaNV()
    {
        return manv;
    }
    public void setMaNV(String manv)
    {
        this.manv=manv;
    }
    public Date getNgayIn()
    {
        return ngayin;
    }
    public void setNgayIn(Date ngayin)
    {
        this.ngayin=ngayin;
    }
}
