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
public class KhachHang {
    private String makh;
    private String tenkh;
    private String diachi;
    private String ngaysinh;
    public KhachHang()
    {

    }
    public KhachHang(String makh, String tenkh, String diachi, String ngaysinh)
    {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
    }
    public String getMaKH()
    {
        return makh;
    }
    public void setMaKH(String makh)
    {
        this.makh = makh;
    }
    public String getTenKH()
    {
        return tenkh;
    }
    public void setTenKH(String tenkh)
    {
        this.tenkh = tenkh;
    }
    public String getDiaChi()
    {
        return diachi;
    }
    public void setDiaChi(String diachi)
    {
        this.diachi=diachi;
    }
    public String getNgaySinh()
    {
        return ngaysinh;
    }
    public void setNgaySinh(String ngaysinh)
    {
        this.ngaysinh=ngaysinh;
    }
}
