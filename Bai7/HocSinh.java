/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;
import java.util.*;
/**
 *
 * @author Admin
 */
public class HocSinh extends Nguoi {
    private String lop;
    private String khoahoc;
    private String kyhoc;
    
    public HocSinh (){
        
    }

    public HocSinh(String lop, String khoahoc, String kyhoc, String hoten) {
        this.hoten= hoten;
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.kyhoc = kyhoc;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("Nhap thong tin lop hoc (vd 10A1):");
        lop= sc.nextLine();
        System.out.println("Nhap thong tin khoa hoc :");
        khoahoc=sc.nextLine();
        System.out.println("Nhap thong tin ky hoc :");
        kyhoc=sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        
        System.out.println("\tLop: "+lop);
        System.out.println("\tKhoa hoc :"+khoahoc);
        System.out.println("\tKy hoc :"+kyhoc);
        
    }
    
    public String getLop(){
        return lop;
    }
}
