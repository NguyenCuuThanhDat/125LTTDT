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
public class QLHS {
    private ArrayList<HocSinh> dshs;
   
    public QLHS(){
        dshs= new ArrayList<HocSinh>(10);
    }
    
    public void themHS(HocSinh hs){
        dshs.add(hs);
        
    }
    
    public void NhapDanhSachHS(Scanner sc){
        HocSinh hs;
        
        System.out.println("Nhap vao so luong hoc sinh :");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin hoc sinh trong danh sach !");
        for(int i =0 ; i<n; i ++){
            System.out.println("\tHoc sinh thu " + (i+1) + " la :");
            hs= new HocSinh();
            hs.NhapThongTin(sc);
            themHS(hs);
        
    }
    }
    
    public void HienThiDS(){
        int n = dshs.size();
        for(int i=0 ; i<n ; i++){
            System.out.println("\t Hoc sinh thu " +(i+1)+" la:");
            dshs.get(i).HienThiThongTin();
        }
    }
    
    public void TimKiemThongTin( int namSinh ,String Que){
        for(HocSinh hs: dshs){
            if((hs.getNgaySinh().getYear()+1900==namSinh)&&(Que.equals(hs.getQueQuan()))){
                hs.HienThiThongTin();
            }
        }
    }
    public void TimKiemThongTin(String Lop){
        for(HocSinh hs:dshs){
            if(Lop.equals(hs.getLop()))
                hs.HienThiThongTin();
        }
    }
}
