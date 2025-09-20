/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien extends CanBo {
    private String congviec210;
    
    public NhanVien() {
        
    }

    public NhanVien(String congviec, String hoten, Date ngaysinh, String gioitinh, String diachi) {
        super(hoten, ngaysinh, gioitinh, diachi);
        this.congviec210 = congviec;
    }
    
    public void NhapThongTin(Scanner sc ) throws ParseException{
        super.NhapThongTin(sc);
        System.out.print("\n Nhap cong viec :");
        congviec210 = sc.nextLine();
    }
    
    public void HienThiThpngTin(){
        super.HienThiThongTin();
        System.out.print("\n Cong viec :" + congviec210);
    }
    
    
}
