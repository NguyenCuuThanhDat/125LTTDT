/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoten;
    private int socmnd;
    private Date ngaysinh;
    public Nguoi(){
        
    }

    public Nguoi(String hoten, int socmnd, Date ngaysinh) {
        this.hoten = hoten;
        this.socmnd = socmnd;
        this.ngaysinh = ngaysinh;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\nNhap ho ten :");
        hoten = sc.nextLine();
        System.out.print("\nNhap ngay sinh (dd/MM/yyyy)");
        String strDate = sc.nextLine();
        ngaysinh = strToDate(strDate);
        System.out.println("\nNhap CMND : ");
        socmnd = sc.nextInt();
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
        System.out.println("\nHo ten:"+ hoten);
        System.out.println("\nNgay sinh: "+ (ngaysinh != null ? sdf.format(ngaysinh) : "null"));
        System.out.println("\nSo CMND: "+socmnd);
    }
    
    public int getCMND(){
        return socmnd;
    }
}


