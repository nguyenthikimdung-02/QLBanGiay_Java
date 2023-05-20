/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Blob;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class Giay {
    private String magiay;
    private String tengiay;
    private float giaban;
    private String nsx;
    public Giay()
    {

    }
    public Giay(String ma, String ten, float gia, String sx)
    {
        this.magiay = ma;
        this.tengiay = ten;
        this.giaban = gia;
        this.nsx = sx;
    }
    public String getMaGiay()
    {
        return magiay;
    }
    public void setMaGiay(String magiay)
    {
        this.magiay = magiay;
    }
    public String getTenGiay()
    {
        return tengiay;
    }
    public void setTenGiay(String tengiay)
    {
        this.tengiay = tengiay;
    }
    public float getGiaBan()
    {
        return giaban;
    }
    public void setGiaBan(float giaban)
    {
        this.giaban=giaban;
    }
    public String getNSX()
    {
        return nsx;
    }
    public void setNSX(String nsx)
    {
        this.nsx=nsx;
    }
    
}
