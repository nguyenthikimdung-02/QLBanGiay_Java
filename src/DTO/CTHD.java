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
    private int sl;
    private double dongia;
    public CTHD()
    {

    }
    public CTHD(String mahd, String magiay, String manv, int sl, double dongia)
    {
        this.mahd = mahd;
        this.magiay = magiay;
        this.manv = manv;
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
    public int getSL()
    {
        return sl;
    }
    public void setSL(int sl)
    {
        this.sl=sl;
    }
    public double getDonGia()
    {
        return dongia;
    }
    public void setDonGia(double dongia)
    {
        this.dongia=dongia;
    }
}
