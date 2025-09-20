/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.text.ParseException;
import java.util.*;

/**
 *
 * @author Admin
 */
public class HoDan extends Nguoi {
    
    private int songuoi210;
    private int sonha210;
    private Nguoi[] list210;
    
    public HoDan(){
        list210= new Nguoi[10];
    }

    

    public HoDan(int songuoi, int sonha,  String hoten, Date ngaysinh, String nghenghiep) {
        super(hoten, ngaysinh, nghenghiep);
        this.songuoi210 = songuoi;
        this.sonha210 = sonha;
      
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException {
        
        System.out.println("\nNhap so nguoi :");
        this.songuoi210=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap so nha :");
        sonha210=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap thong tin tung nguoi trong ho :");
        for(int i = 0 ; i< songuoi210; i ++){
            System.out.println("\nNguoi thu " + (i+1) + " la :");
            list210[i]=new Nguoi();
            list210[i].NhapThongTin(sc);
        }
    }
    public void HienThiThongTin(){
        //super.HienThiThongTin();
        System.out.println("\nSo nguoi : "+songuoi210);
        System.out.println("\nSo nha : "+sonha210);
        System.out.println("\nThong tin cua tung nguoi trong gia dinh :");
        for(int i =0 ; i<songuoi210; i++){
            System.out.println("\nNguoi thu :"+ (i+1) + " la : ");
            list210[i].HienThiThongTin();
        }
    }
    public Nguoi[] getList(){
        return list210;
    }
    
    public int getSoNguoi(){
        return songuoi210;
    }
    
}
