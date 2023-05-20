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
    private int sl;
    public CTKC()
    {

    }
    public CTKC(String size, String magiay, int sl)
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
    public int getSL()
    {
        return sl;
    }
    public void setSL(int sl)
    {
        this.sl=sl;
    }
}
