/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class HoaDon extends KhachHang{
    private String chiTiet;
    private int chisomoi;
    private int chisocu;

  
    
    public HoaDon(String makhachhang, String hotenchuho, int sonha, String macongtodien, String chiTiet, String maHoaDon, String ChiTiet, int chisomoi, int chisocu){
        super(makhachhang, hotenchuho, sonha, macongtodien, maHoaDon, chiTiet);
        this.chiTiet = chiTiet;
        this.chisomoi = chisomoi;
        this.chisocu = chisocu;
    }


   

      public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("nhap vao chi so moi: ");
        chisomoi = sc.nextInt();
        System.out.print("nhap vao chi so cu: ");
        chisocu = sc.nextInt();
    }
    
    /**
     *
     */
    @Override
    public void output(){
        super.output();
        System.out.println("chi so cu: "+chisocu+"chí so moi"+chisomoi+"");
        System.out.println("so tien phai tra la: "+tinhtien());
    }
  
     public int tinhtien(){
        int sotien = this.chisomoi - this.chisocu;
        int tien = 0;
        if(sotien<=10){
         tien = sotien * 5973;
        }else if(sotien<=20){
         tien = 10 * 5973 + (sotien - 10) * 7052;   
        }else if(sotien<=30){
         tien = 10*5973 + 10* 7052 +(sotien - 10) * 8669;    
        }else{
         tien = 10*5973 + 10*7052 + 10*8669 - (sotien-10) * 15929;
        }
        return tien;
        
    }

  
}
