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
    private String tentg210;
    private int sotrang210;
    
    public Sach(){
        
    }


    public Sach(String tentg, int sotrang, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.tentg210 = tentg;
        this.sotrang210 = sotrang;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\n Nhap ten tac gia:");
        tentg210= sc.nextLine();
        System.out.print("\n Nhap so trang:");
        sotrang210= sc.nextInt();
        sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n Ten tac gia:" + tentg210);
        System.out.print("\n So trang:" + sotrang210);
        
    }
    
}
