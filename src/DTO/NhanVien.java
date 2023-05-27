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
public class NhanVien {
    private String manv;
    private String tennv;
    private String tenid;
    private String ngaysinh;
    private String gioitinh;
    private String diachi;
    private String luong;
    private String ngayvaolam;
    public NhanVien()
    {

    }
    public NhanVien(String manv, String tennv, String tenid, String ngaysinh,String gioitinh, String diachi,String luong, String ngayvaolam)
    {
        this.manv = manv;
        this.tennv = tennv;
        this.tenid = tenid;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.luong = luong;
        this.ngayvaolam = ngayvaolam;
    }
    public String getMaNV()
    {
        return manv;
    }
    public void setMaNV(String manv)
    {
        this.manv = manv;
    }
    public String getTenNV()
    {
        return tennv;
    }
    public void setTenNV(String tennv)
    {
        this.tennv = tennv;
    }
    public String getTenID()
    {
        return tenid;
    }
    public void setTenID(String tenid)
    {
        this.tenid = tenid;
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
    public String getGioiTinh()
    {
        return gioitinh;
    }
    public void setGioiTinh(String gioitinh)
    {
        this.gioitinh=gioitinh;
    }
    public String getLuong()
    {
        return luong;
    }
    public void setLuong(String luong)
    {
        this.luong=luong;
    }
    public String getNgayVaoLam()
    {
        return ngayvaolam;
    }
    public void setNgayVaoLam(String ngayvaolam)
    {
        this.ngayvaolam=ngayvaolam;
    }
}
