/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class TapChi extends TaiLieu {
    private int sophathanh210;
    private int thangphathanh210;
    
    public TapChi(){
        
    }

    public TapChi(int sophathanh, int thangphathanh, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.sophathanh210 = sophathanh;
        this.thangphathanh210 = thangphathanh;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\nNhap so phat hanh :");
        sophathanh210 = sc.nextInt();
        System.out.print("\nNhap thang phat hanh :");
        thangphathanh210 = sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\nSo phat hanh:"+ sophathanh210);
        System.out.print("\nThang phat hanh:"+ thangphathanh210);
    }
}
