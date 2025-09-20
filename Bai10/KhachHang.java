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
public class KhachHang {
    protected String hotenchuho;
    protected int sonha;
    protected String macongto;
    
    public KhachHang(){
        
    }

    public KhachHang(String hotenchuho, int sonha, String macongto) {
        this.hotenchuho = hotenchuho;
        this.sonha = sonha;
        this.macongto = macongto;
    }
    public void Nhap(Scanner sc){
        System.out.println("Nhap ho ten chu ho :");
        hotenchuho=sc.nextLine();
        System.out.println("Nhap so nha :");
        sonha=sc.nextInt();sc.nextLine();
        System.out.println("Nhap ma cong to :");
        macongto = sc.nextLine();
    }
    
    public void HienThi(){
        System.out.println("Ho ten chu ho :"  +hotenchuho);
        System.out.println("So nha :"+sonha);
        System.out.println("Ma cong to : "+macongto);
    }
}
