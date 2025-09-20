/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author Admin
 */
public class TheMuon extends SinhVien{
    private int sophieumuon;
    private Date ngaymuon;
    private Date hantra;
    private String sohieusach;
    
    public TheMuon(){
        
    }
    

    public TheMuon(int sophieumuon, Date ngaymuon, Date hantra, String sohieusach) {
       
        this.sophieumuon = sophieumuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        
        System.out.println("Nhap so phieu muon :");
        sophieumuon= sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap so ngay muon (dd/MM/yyy) :");
        String strngaymuon=  sc.nextLine();
        ngaymuon = strToDate(strngaymuon);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(ngaymuon);
        cal.add(Calendar.MONTH, 1); 
        hantra = cal.getTime();
        
        System.out.println("Nhap so hieu sach :");
        sohieusach=sc.nextLine();
    }
    public Date strToDate( String strngaymuon){
        Date date = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            date= sdf.parse(strngaymuon);
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang ");
        }
        return date;
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("So phieu muon "+sophieumuon);
        System.out.println("Ngay muon: " + (ngaymuon != null ? sdf.format(ngaymuon) : "null"));
        System.out.println("Han tra: " + (hantra != null ? sdf.format(hantra) : "null"));
        System.out.println("So hieu sach :"+sohieusach);
    }
    
    public Date getHanTra(){
        return hantra;
    }
}
