/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class SinhVien {
   protected String hoten;
   protected String msv;
   protected String ngaysinh;
   protected String quequan;
   
   public SinhVien(){
       
   }

    public SinhVien(String hoten, String msv, String ngaysinh, String quequan) {
        this.hoten = hoten;
        this.msv = msv;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }
   public void NhapThongTin(Scanner sc){
         System.out.println("Nhap ho ten :");
         hoten =sc.nextLine();
         System.out.println("Nhap ma sinh vien :");
         msv= sc.nextLine();
         System.out.println("Nhap ngay sinh (dd/MM/yy) :");
         ngaysinh= sc.nextLine();
         System.out.println("Nhap que quan: ");
         quequan= sc.nextLine();
     }
   public void HienThiThongTin(){

         System.out.println("Ho ten :"+hoten);
         System.out.println("Ma sinh vien :"+msv);
         System.out.println("Ngay sinh :"+ngaysinh );
         System.out.println("Que quan :"+quequan);
     }
   
   
   
}
