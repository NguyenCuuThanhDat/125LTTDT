/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int tuSo ;
    private int mauSo;

    public PhanSo() {
    this.tuSo = 0;
    this.mauSo = 1; 
}

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
     public void NhapPhanSo(Scanner sc){
         int a; 
         int b;
         do{
         System.out.println("\n Nhap vao tu so :");
         a= sc.nextInt();
         System.out.print("\n Nhap vao mau so:");
         b=sc.nextInt();
         if(b==0 ){
             System.out.println("Mau so khong duoc bang khong:");
             
         }else
         {
             this.tuSo=a;
             this.mauSo=b;
             
         }
         }while(b==0);
     }
     public void hienThiPS(){
         if(mauSo*tuSo <0){
             System.out.println("\t -"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
         }else
         {
             System.out.println("\t "+Math.abs(tuSo)+"/"+Math.abs(mauSo));
         }
     }
     
     public PhanSo congPS(PhanSo ps2){
         int a = tuSo*ps2.mauSo+ps2.tuSo*mauSo;
         int b = mauSo*ps2.mauSo;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo truPS(PhanSo ps2){
         int a = tuSo*ps2.mauSo-ps2.tuSo*mauSo;
         int b = mauSo*ps2.mauSo;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo nhanPS(PhanSo ps2){
         int a = tuSo*ps2.tuSo;
         int b = mauSo*ps2.mauSo;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo chiaPS(PhanSo ps2){
         int a = tuSo*ps2.mauSo;
         int b = mauSo*ps2.tuSo;
         
         return new PhanSo(a,b);
     }
     
     public int UCLN(int a , int b ){
         while( a!=b){
             if(a>b){
                 a=a-b;
             }else
             {
                 b=b-a;
             }
         }
         return a;
     }
     
     public boolean kiemTraPSTG(){
         if(UCLN(tuSo,mauSo)==1){
             return true;
         }else
             return false;
     }
     
     public void toiGianPS(){
         int x= UCLN(tuSo, mauSo);
         tuSo/=x;
         mauSo/=x;
     }
}
