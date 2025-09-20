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
    
    private int songuoi;
    private int sonha;
    private Nguoi[] list;
    
    public HoDan(){
        list= new Nguoi[10];
    }

    

    public HoDan(int songuoi, int sonha,  String hoten, Date ngaysinh, String nghenghiep) {
        super(hoten, ngaysinh, nghenghiep);
        this.songuoi = songuoi;
        this.sonha = sonha;
      
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException {
        
        System.out.println("\nNhap so nguoi :");
        this.songuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap so nha :");
        sonha=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap thong tin tung nguoi trong ho :");
        for(int i = 0 ; i< songuoi; i ++){
            System.out.println("\nNguoi thu " + (i+1) + " la :");
            list[i]=new Nguoi();
            list[i].NhapThongTin(sc);
        }
    }
    public void HienThiThongTin(){
        //super.HienThiThongTin();
        System.out.println("\nSo nguoi : "+songuoi);
        System.out.println("\nSo nha : "+sonha);
        System.out.println("\nThong tin cua tung nguoi trong gia dinh :");
        for(int i =0 ; i<songuoi; i++){
            System.out.println("\nNguoi thu :"+ (i+1) + " la : ");
            list[i].HienThiThongTin();
        }
    }
    public Nguoi[] getList(){
        return list;
    }
    
    public int getSoNguoi(){
        return songuoi;
    }
    
}
