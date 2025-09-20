/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KySu extends CanBo {
    private String nganhdaotao;
    
    public KySu(){
        
    }

    public KySu(String nganhdaotao) {
        this.nganhdaotao = nganhdaotao;
    }

    public KySu(String nganhdaotao, String hoten, Date ngaysinh, String gioitinh, String diachi) {
        super(hoten, ngaysinh, gioitinh, diachi);
        this.nganhdaotao = nganhdaotao;
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException{
        super.NhapThongTin(sc);
        System.out.print("\n Nganh dao tao :");
        nganhdaotao = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n\t Nganh dao tao:"+ nganhdaotao);
    }
}
