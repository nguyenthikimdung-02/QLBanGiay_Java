/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class NSX {
    private String mansx;
    private String tennsx;
    public NSX()
    {
        
    }
    public NSX(String mansx, String tennsx)
    {
        this.mansx=mansx;
        this.tennsx=tennsx;
    }
    public String getMaNSX()
    {
        return mansx;
    }
    public void setMaNSX(String mansx)
    {
        this.mansx=mansx;
    }
    public String getTenNSX()
    {
        return tennsx;
    }
    public void setTenNSX(String tennsx)
    {
        this.tennsx=tennsx;
    }
}
