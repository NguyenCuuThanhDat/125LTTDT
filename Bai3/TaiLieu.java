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
    private String matailieu;
    private String tennhaxb;
    private int sobanphathanh;
    
    public TaiLieu(){
        
    }

    public TaiLieu(String matailieu, String tennhaxb, int sobanphathanh) {
        this.matailieu = matailieu;
        this.tennhaxb = tennhaxb;
        this.sobanphathanh = sobanphathanh;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap ma tai lieu:");
        matailieu = sc.nextLine();
        System.out.print("\n Nhap ten nha xuat ban :");
        tennhaxb = sc.nextLine();
        System.out.print("\n Nhap ban phat hanh :");
        sobanphathanh = sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        System.out.print("\n Ma tai lieu :"+ matailieu);
        System.out.print("\n Ten nha xuat ban  :"+ tennhaxb);
        System.out.print("\n So ban phat hanh :"+ sobanphathanh);
    }  
    
    public String getMaTaiLieu(){
        return matailieu;
    }
}
