/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;
import java.util.*;
/**
 *
 * @author Admin
 */
public class QuanLy {
    private ArrayList<TheMuon>ds;
     public QuanLy(){
          ds = new ArrayList<TheMuon>(10);
         
     }
     public void themTheMuon(TheMuon tm){
         ds.add(tm);
     }
     public void NhapDS(Scanner sc){
         TheMuon tm;
         System.out.println("Nhap so luong the muon :");
         int n = sc.nextInt();
         sc.nextLine();
         
         System.out.println("Nhap vao danh sach");
         for(int i =0; i<n ; i++){
             System.out.println(" The muon thu "+(i+1)+" la :");
             tm=new TheMuon();
             tm.NhapThongTin(sc);
             themTheMuon(tm);
         }
     }
     
     public void HienThiDStraCuoiThang(){
         for(TheMuon tm :ds){
             if(tm.getHanTra().getDate()==31||tm.getHanTra().getDate()==30){
                 tm.HienThiThongTin();
             }
         }
     }
}
