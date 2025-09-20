/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Nguoi {
    protected String hoten;
    private Date ngaysinh;
    private String quequan;
    
    public Nguoi(){
        
    }

    public Nguoi(String hoten, Date ngaysinh, String quequan) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.println("Nhap thong tin ho ten :");
        hoten = sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh :");
        String strDate = sc.nextLine();
        ngaysinh = strToDate(strDate);
        System.out.println("Nhap thong tin que quan :");
        quequan = sc.nextLine();
    }
     private Date strToDate (String strDate){
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            date = sdf.parse(strDate);
            
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang !");
        }
    return date;
    }
     
     public void HienThiThongTin(){
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.println("Ho ten :" + hoten);
         System.out.println("Ngay sinh :"+(ngaysinh != null ? sdf.format(ngaysinh) : "null"));
         System.out.println("Que quan :"+quequan);
     }
     
     public Date getNgaySinh(){
         return ngaysinh;
     }
     public String getQueQuan(){
         return quequan;
     }
}
