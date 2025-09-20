/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class ThiSinh {
    private int sobaodanh;
    private String hoten;
    private String diachi ;
    private String dienUuTienKV;
    
    public ThiSinh(){
        
    }

    public ThiSinh(int sobaodanh, String hoten, String diachi, String dienUuTienKV) {
        this.sobaodanh = sobaodanh;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dienUuTienKV = dienUuTienKV;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap so bao danh :");
        sobaodanh= sc.nextInt();
        System.out.print("\n Nhap ho ten :");
        hoten= sc.nextLine();
        
        System.out.print("\n Nhap dia chi :");
        diachi= sc.nextLine();
        
        System.out.print("\n Nhap dien uu tien khu vuc nao :");
        dienUuTienKV= sc.nextLine();
        
    }
    
    public void HienThiThongTin(){
        System.out.print("\nSo bao danh : " + sobaodanh);
        System.out.print("\nHo ten: " + hoten);
        System.out.print("\nDia chi : " + diachi);
        System.out.print("\nDien uu tien thuoc khu vuc : " + dienUuTienKV);
    }
    
    public int getThiSinh(){
        return sobaodanh;
    }
}
