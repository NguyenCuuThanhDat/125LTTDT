/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhoiA extends ThiSinh {
    private String mon1;
    private String mon2;
    private String mon3;
    
    public KhoiA(){
        
    }

   

    public KhoiA(String mon1, String mon2, String mon3) {
        
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\nNhap ten mon 1:");
        mon1= sc.nextLine();
        
        System.out.print("\nNhap ten mon 2:");
        mon2=sc.nextLine();
         
        System.out.print("\nNhap ten mon 3:");
        mon3= sc.nextLine();
         
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n To hop mon: " + mon1 + ", "+ mon2 +"," + mon3+".\n");
    }
}
