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
    private String hoten;
    private Date ngaysinh;
    private String gioitinh;
    private String diachi;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    public CanBo(){
        
    }

    public CanBo(String hoten, Date ngaysinh, String gioitinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException{
     System.out.print("\n Nhap ten nhan vien :");
     hoten = sc.nextLine();
     System.out.print("\n Nhap ngay sinh nhan vien :");
     String input = sc.nextLine();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     Date ngaysinh = sdf.parse(input);
     System.out.print("\n Nhap gioi tinh nhan vien :");
     gioitinh = sc.nextLine();
     System.out.print("\n Nhap dia chi nhan vien :");
     diachi = sc.nextLine();
     
    }
    public void HienThiThongTin(){
     System.out.print("\n\t ho ten " + hoten);
     System.out.print("\n\t ngay sinh  " + ngaysinh);
     System.out.print("\n\t gioi tinh " + gioitinh );
     System.out.print("\n\t dia chi " + diachi );
    }
    
    public String gethoten(){
        return this.hoten;
    }
}
