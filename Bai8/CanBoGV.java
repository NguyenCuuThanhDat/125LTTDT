/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;
import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class CanBoGV extends Nguoi{
   private double luongcung;
   private double thuong;
   private double phat;
   private double luongthuclinh;
   
   public CanBoGV(){
       
   }

    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("Nhap muc luong cung (*.000.000) :");
        luongcung=sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap muc thuong *.000.000) :");
        thuong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap muc phat *.000.000) :");
        phat= sc.nextDouble();
        sc.nextLine();
        
        luongthuclinh= luongcung+thuong-phat;
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        DecimalFormat df= new DecimalFormat("#,###.##");
        System.out.println("Muc luong cung : " + df.format(luongcung));
        System.out.println("Muc tien thuong : " + df.format(thuong));
        System.out.println("Muc tien phat : " + df.format(phat));
        System.out.println("Muc luong thuc linh : " + df.format(luongthuclinh));
    }
    public double getLUongThucLinh(){
        return luongthuclinh;
    }
    
}
