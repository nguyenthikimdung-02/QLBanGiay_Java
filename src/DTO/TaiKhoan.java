/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author NGUYEN THI KIM DUNG
 */
public class TaiKhoan {
    private String tenid;
    private String pass;
    public TaiKhoan()
    {
        
    }
    public TaiKhoan(String tenid, String pass)
    {
        this.tenid=tenid;
        this.pass=pass;
    }
    public String getTenID()
    {
        return tenid;
    }
    public void setTenID(String tenid)
    {
        this.tenid=tenid;
    }
    public String getPass()
    {
        return pass;
    }
    public void setPass(String pass)
    {
        this.pass=pass;
    }
}
