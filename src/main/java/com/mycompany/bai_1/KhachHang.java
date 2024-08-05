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
public class KhachHang {
    private String maKhachHang;
    private String hoTenChuHo;
    private int soNha;
    private String maCongToDien; 
    private String maHoaDon;
    private String chiTiet;
    
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    


    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setMakhachhang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setHotenchuho(String hotenchuho) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public void setSonha(int sonha) {
        this.soNha = soNha;
    }

    public void setMacongtodien(String macongtodien) {
        this.maCongToDien = maCongToDien;
    }
    

    public String getMakhachhang() {
        return maKhachHang;
    }

    public String getHotenchuho() {
        return hoTenChuHo;
    }

    public int getSonha() {
        return soNha;
    }

    public String getMacongtodien() {
        return maCongToDien;
    }
   
   //hàm constructor có tham số
    public KhachHang(String maKhachHang, String hoTenChuHo, int soNha, String maCongToDien, String maHoaDon, String chiTiet){
        this.maKhachHang = maKhachHang;
        this.maCongToDien = maCongToDien;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maHoaDon = maHoaDon;
        this.chiTiet = chiTiet;
}
    //hàm constructor không có tham số
    public KhachHang(String makhachhang, String tenMoi){
        makhachhang="";
        maCongToDien="";
        hoTenChuHo="";
        soNha=0;
    }
     public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ma chu ho: ");
        maKhachHang = sc.nextLine();
        System.out.print("nhap vao ho ten chu ho: ");
        hoTenChuHo = sc.nextLine();
        System.out.print("nhap vao so nha: ");
        soNha = sc.nextInt();
        System.out.print("nhap vao ma cong to dien: ");
        maCongToDien = sc.next(); 
    }
    
    public void output(){
        
        System.out.println("ma chu ho: "+maKhachHang);
        System.out.println("ho ten chu ho: "+hoTenChuHo);
        System.out.println("so nha: "+soNha);
        System.out.println("ma cong to dien: "+maCongToDien);

    }
    
   
}
