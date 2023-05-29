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
public class CTHD {
    private String mahd;
    private String magiay;
    private String manv;
    private String makh;
    private String size;
    private String sl;
    private String dongia;
    public CTHD()
    {

    }
    public CTHD(String mahd, String magiay, String manv,String makh,String size, String sl, String dongia)
    {
        this.mahd = mahd;
        this.magiay = magiay;
        this.manv = manv;
        this.makh=makh;
        this.size=size;
        this.sl=sl;
        this.dongia=dongia;
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
    public String getMaKH()
    {
        return makh;
    }
    public void setMaKH(String makh)
    {
        this.makh=makh;
    }
    public String getSize()
    {
        return size;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public String getSL()
    {
        return sl;
    }
    public void setSL(String sl)
    {
        this.sl=sl;
    }
    public String getDonGia()
    {
        return dongia;
    }
    public void setDonGia(String dongia)
    {
        this.dongia=dongia;
    }
}
