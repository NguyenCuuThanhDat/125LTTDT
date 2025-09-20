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
    private int sobaodanh210;
    private String hoten210;
    private String diachi210 ;
    private String dienUuTienKV210;
    
    public ThiSinh(){
        
    }

    public ThiSinh(int sobaodanh, String hoten, String diachi, String dienUuTienKV) {
        this.sobaodanh210 = sobaodanh;
        this.hoten210 = hoten;
        this.diachi210 = diachi;
        this.dienUuTienKV210 = dienUuTienKV;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap so bao danh :");
        sobaodanh210= sc.nextInt();
        System.out.print("\n Nhap ho ten :");
        hoten210= sc.nextLine();
        
        System.out.print("\n Nhap dia chi :");
        diachi210= sc.nextLine();
        
        System.out.print("\n Nhap dien uu tien khu vuc nao :");
        dienUuTienKV210= sc.nextLine();
        
    }
    
    public void HienThiThongTin(){
        System.out.print("\nSo bao danh : " + sobaodanh210);
        System.out.print("\nHo ten: " + hoten210);
        System.out.print("\nDia chi : " + diachi210);
        System.out.print("\nDien uu tien thuoc khu vuc : " + dienUuTienKV210);
    }
    
    public int getThiSinh(){
        return sobaodanh210;
    }
}
