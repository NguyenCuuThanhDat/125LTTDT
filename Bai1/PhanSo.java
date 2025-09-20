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
    private int tuSo210 ;
    private int mauSo210;

    public PhanSo() {
    this.tuSo210 = 0;
    this.mauSo210 = 1; 
}

    public int getTuSo() {
        return tuSo210;
    }

    public void setTuSo(int tuSo) {
        this.tuSo210 = tuSo;
    }

    public int getMauSo() {
        return mauSo210;
    }

    public void setMauSo(int mauSo) {
        this.mauSo210 = mauSo;
    }
    

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo210 = tuSo;
        this.mauSo210 = mauSo;
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
             this.tuSo210=a;
             this.mauSo210=b;
             
         }
         }while(b==0);
     }
     public void hienThiPS(){
         if(mauSo210*tuSo210 <0){
             System.out.println("\t -"+Math.abs(tuSo210)+"/"+Math.abs(mauSo210));
         }else
         {
             System.out.println("\t "+Math.abs(tuSo210)+"/"+Math.abs(mauSo210));
         }
     }
     
     public PhanSo congPS(PhanSo ps2){
         int a = tuSo210*ps2.mauSo210+ps2.tuSo210*mauSo210;
         int b = mauSo210*ps2.mauSo210;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo truPS(PhanSo ps2){
         int a = tuSo210*ps2.mauSo210-ps2.tuSo210*mauSo210;
         int b = mauSo210*ps2.mauSo210;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo nhanPS(PhanSo ps2){
         int a = tuSo210*ps2.tuSo210;
         int b = mauSo210*ps2.mauSo210;
         
         return new PhanSo(a,b);
     }
     
     public PhanSo chiaPS(PhanSo ps2){
         int a = tuSo210*ps2.mauSo210;
         int b = mauSo210*ps2.tuSo210;
         
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
         if(UCLN(tuSo210,mauSo210)==1){
             return true;
         }else
             return false;
     }
     
     public void toiGianPS(){
         int x= UCLN(tuSo210, mauSo210);
         tuSo210/=x;
         mauSo210/=x;
     }
}
