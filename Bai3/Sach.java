/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu {
    private String tentg;
    private int sotrang;
    
    public Sach(){
        
    }


    public Sach(String tentg, int sotrang, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.tentg = tentg;
        this.sotrang = sotrang;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\n Nhap ten tac gia:");
        tentg= sc.nextLine();
        System.out.print("\n Nhap so trang:");
        sotrang= sc.nextInt();
        sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n Ten tac gia:" + tentg);
        System.out.print("\n So trang:" + sotrang);
        
    }
    
}
