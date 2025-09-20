/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    private String matailieu210;
    private String tennhaxb210;
    private int sobanphathanh210;
    
    public TaiLieu(){
        
    }

    public TaiLieu(String matailieu, String tennhaxb, int sobanphathanh) {
        this.matailieu210 = matailieu;
        this.tennhaxb210 = tennhaxb;
        this.sobanphathanh210 = sobanphathanh;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap ma tai lieu:");
        matailieu210 = sc.nextLine();
        System.out.print("\n Nhap ten nha xuat ban :");
        tennhaxb210 = sc.nextLine();
        System.out.print("\n Nhap ban phat hanh :");
        sobanphathanh210 = sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        System.out.print("\n Ma tai lieu :"+ matailieu210);
        System.out.print("\n Ten nha xuat ban  :"+ tennhaxb210);
        System.out.print("\n So ban phat hanh :"+ sobanphathanh210);
    }  
    
    public String getMaTaiLieu(){
        return matailieu210;
    }
}
