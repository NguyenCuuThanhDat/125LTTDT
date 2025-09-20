/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;
import java.util.*;
/**
 *
 * @author Admin
 */
public class BienLai extends KhachHang {
    private int chisomoi;
    private int chisocu;
    private double tien;
    
    public BienLai(){
        
    }


    public BienLai(int chisomoi, int chisocu, double tien, String hotenchuho) {
        this.hotenchuho=hotenchuho;
        this.chisomoi = chisomoi;
        this.chisocu = chisocu;
        this.tien = tien;
    }
    
    public void Nhap(Scanner sc){
        super.Nhap(sc);
        System.out.println("Nhap chi so moi :");
        chisomoi=sc.nextInt();sc.nextLine();
        System.out.println("Nhap chi so cu : ");
        chisocu=sc.nextInt();sc.nextLine();
        
      tien =(chisomoi-chisocu)*750;
    }
    
    public void HienThi(){
        super.HienThi();
        System.out.println("Chi so moi :"+chisomoi);
        System.out.println("Chi so cu :"+chisocu);
        System.out.println("Tien :"+tien +" vnd.");
    }
}
