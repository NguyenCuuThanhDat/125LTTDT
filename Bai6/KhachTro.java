/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;
import java.util.*;
/**
 *
 * @author Admin
 */
public class KhachTro extends Nguoi{
    private int songaytro;
    private String loaiphong;
    private double giaphong;
    
    public KhachTro(){
        
}

    public KhachTro(int songaytro, String loaiphong, double giaphong, String hoten, int socmnd, Date ngaysinh) {
        super(hoten, socmnd, ngaysinh);
        this.songaytro = songaytro;
        this.loaiphong = loaiphong;
        this.giaphong = giaphong;
    }
 
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("\nNhap so ngay tro:");
        songaytro=sc.nextInt() ;sc.nextLine();
        System.out.println("\nNhap vao loai phong ( 1 -VIP ; 2- LUXURY ; 3- GOOD ; 4- BASIC): ");
        loaiphong=sc.nextLine();
        System.out.println("\nNhap gia phong ((1:500 ; 2:400 ; 3: 250 ; 4: 100) / day):");
        giaphong=sc.nextDouble();sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\n So ngay tro:"+songaytro);
        System.out.println("\n Loai phong :"+loaiphong);
        System.out.println("\n Gia phong :"+giaphong);
    }
    public int getSoNgayTro(){
        return songaytro;
    }
    public double getGiaPhong(){
        return giaphong;
    }
}
    
    
