/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CanBo {
    private String hoten210;
    private Date ngaysinh210;
    private String gioitinh210;
    private String diachi210;

    public String getHoten() {
        return hoten210;
    }

    public void setHoten(String hoten) {
        this.hoten210 = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh210;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh210 = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh210;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh210 = gioitinh;
    }

    public String getDiachi() {
        return diachi210;
    }

    public void setDiachi(String diachi) {
        this.diachi210 = diachi;
    }
    
    
    public CanBo(){
        
    }

    public CanBo(String hoten, Date ngaysinh, String gioitinh, String diachi) {
        this.hoten210 = hoten;
        this.ngaysinh210 = ngaysinh;
        this.gioitinh210 = gioitinh;
        this.diachi210 = diachi;
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException{
     System.out.print("\n Nhap ten nhan vien :");
     hoten210 = sc.nextLine();
     System.out.print("\n Nhap ngay sinh nhan vien :");
     String input = sc.nextLine();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     Date ngaysinh = sdf.parse(input);
     System.out.print("\n Nhap gioi tinh nhan vien :");
     gioitinh210 = sc.nextLine();
     System.out.print("\n Nhap dia chi nhan vien :");
     diachi210 = sc.nextLine();
     
    }
    public void HienThiThongTin(){
     System.out.print("\n\t ho ten " + hoten210);
     System.out.print("\n\t ngay sinh  " + ngaysinh210);
     System.out.print("\n\t gioi tinh " + gioitinh210 );
     System.out.print("\n\t dia chi " + diachi210 );
    }
    
    public String gethoten(){
        return this.hoten210;
    }
}
