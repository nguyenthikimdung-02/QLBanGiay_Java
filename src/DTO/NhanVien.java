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
    private Date ngaysinh;
    private String gioitinh;
    private String diachi;
    private double luong;
    private Date ngayvaolam;
    public NhanVien()
    {

    }
    public NhanVien(String manv, String tennv, String tenid, Date ngaysinh,String gioitinh, String diachi,double luong, Date ngayvaolam)
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
    public Date getNgaySinh()
    {
        return ngaysinh;
    }
    public void setNgaySinh(Date ngaysinh)
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
    public double getLuong()
    {
        return luong;
    }
    public void setLuong(double luong)
    {
        this.luong=luong;
    }
    public Date getNgayVaoLam()
    {
        return ngayvaolam;
    }
    public void setNgayVaoLam(Date ngayvaolam)
    {
        this.ngayvaolam=ngayvaolam;
    }
}
