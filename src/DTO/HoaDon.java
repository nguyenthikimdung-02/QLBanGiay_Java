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
    private String ngayin;
    public HoaDon()
    {

    }
    public HoaDon(String mahd, String ngayin)
    {
        this.mahd = mahd;
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
    public String getNgayIn()
    {
        return ngayin;
    }
    public void setNgayIn(String ngayin)
    {
        this.ngayin=ngayin;
    }
}
