/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoten;
    private Date ngaysinh;
    private String nghenghiep;
    
public Nguoi(){
   
}

    public Nguoi(String hoten, Date ngaysinh, String nghenghiep) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.nghenghiep = nghenghiep;
    }

    public void NhapThongTin(Scanner sc) throws ParseException{
        System.out.println("\nNhap vao ho ten :");
        hoten= sc.nextLine();
        System.out.println("\nNhap ngay sinh (dd/MM/yy):");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        this.ngaysinh = sdf.parse(input);
        System.out.println("\nNhap nghe nghiep :");
        nghenghiep=sc.nextLine();
    }
    
    public void HienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nHo ten :"+ hoten);
        System.out.println("\nNgay sinh :"+(ngaysinh != null ? sdf.format(ngaysinh) : "Chưa nhập"));
        System.out.println("\nNghe nghiep :"+nghenghiep);
    }
    public Date getNgaySinh(){
        return ngaysinh;
    }
    
}


