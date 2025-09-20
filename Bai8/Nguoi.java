/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoten;
    private String ngaysinh;
    private String quequan;
     public Nguoi(){
         
     }

    public Nguoi(String hoten, String ngaysinh, String quequan) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }
     public void NhapThongTin(Scanner sc){
         System.out.println("Nhap ho ten :");
         hoten =sc.nextLine();
         System.out.println("Nhap ngay sinh (dd/MM/yy) :");
         ngaysinh= sc.nextLine();
         System.out.println("Nhap que quan: ");
         quequan= sc.nextLine();
     }
     
     
     public void HienThiThongTin(){
         
         System.out.println("Ho ten :"+hoten);
         System.out.println("Ngay sinh :"+ngaysinh );
         System.out.println("Que quan :"+quequan);
     }
     
}
