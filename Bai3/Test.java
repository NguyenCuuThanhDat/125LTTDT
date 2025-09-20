/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QuanLySach qls = new QuanLySach();
        qls.NhapDanhSach(sc);
        System.out.print("\n Nhap vao phuong thuc tim kiem  theo: \n 1- Theo loai tai lie \n 2- Theo ma so tai lieu \n:");
        int chon = sc.nextInt();
        switch(chon){
            case 1:
        
                System.out.print("\nNhap vao loai tai lieu can tim:");
                String loai = sc.nextLine();
                qls.TimLoaiTL(loai);
                break;
            case 2:
                
                System.out.print("\nNhap vao ma tai lieu can tim ");
                String maTL = sc.nextLine();
                qls.TimMaTL(maTL);
                break;
                
            default:
               System.out.print("Lua chon khong hop le!"); 
        sc.close();
    }
}
}
