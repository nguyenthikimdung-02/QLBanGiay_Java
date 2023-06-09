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
public class CTPN {
    private String maphieu;
    private String magiay;
    private String ngaynhap;
    private String kichco;
    private String mansx;
    private String mancc;
    private String sl;
    private String gianhap;
    public CTPN()
    {

    }
    public CTPN(String maphieu, String magiay, String ngaynhap, String kichco, String mansx,String mancc, String sl,String gianhap)
    {
        this.maphieu = maphieu;
        this.magiay = magiay;
        this.ngaynhap = ngaynhap;
        this.kichco = kichco;
        this.mansx = mansx;
        this.mancc = mancc;
        this.sl = sl;
        this.gianhap = gianhap;
    }
    public String getMaPhieu()
    {
        return maphieu;
    }
    public void setMaPhieu(String maphieu)
    {
        this.maphieu = maphieu;
    }
    public String getMaGiay()
    {
        return magiay;
    }
    public void setMaGiay(String magiay)
    {
        this.magiay = magiay;
    }
    public String getNgayNhap()
    {
        return ngaynhap;
    }
    public void setNgayNhap(String ngaynhap)
    {
        this.ngaynhap=ngaynhap;
    }
    public String getSize()
    {
        return kichco;
    }
    public void setSize(String kichco)
    {
        this.kichco=kichco;
    }
    public String getSL()
    {
        return sl;
    }
    public void setSL(String sl)
    {
        this.sl=sl;
    }
    public String getGiaNhap()
    {
        return gianhap;
    }
    public void setGiaNhap(String gianhap)
    {
        this.gianhap=gianhap;
    }
    public String getMaNCC()
    {
        return mancc;
    }
    public void setMaNCC(String mancc)
    {
        this.mancc=mancc;
    }
    public String getMaNSX()
    {
        return mansx;
    }
    public void setMaNSX(String mansx)
    {
        this.mansx=mansx;
    }
}
