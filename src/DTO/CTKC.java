/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class CTKC {
    private String size;
    private String magiay;
    private String sl;
    public CTKC()
    {

    }
    public CTKC(String size, String magiay, String sl)
    {
        this.size = size;
        this.magiay = magiay;
        this.sl = sl;
    }
    public String getMaGiay()
    {
        return magiay;
    }
    public void setMaGiay(String magiay)
    {
        this.magiay = magiay;
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
}
