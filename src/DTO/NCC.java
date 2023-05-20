/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class NCC {
    private String mancc;
    private String tenncc;
    public NCC()
    {
        
    }
    public NCC(String mancc, String tenncc)
    {
        this.mancc=mancc;
        this.tenncc=tenncc;
    }
    public String getMaNCC()
    {
        return mancc;
    }
    public void setMaNCC(String mancc)
    {
        this.mancc=mancc;
    }
    public String getTenNCC()
    {
        return tenncc;
    }
    public void setTenNCC(String tenncc)
    {
        this.tenncc=tenncc;
    }
}
