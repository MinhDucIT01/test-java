package com.mycompany.bai_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai_1 {
    public static void main(String[] args) {
       ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.nextLine());
       danhSachHoaDon=new ArrayList(n);
        System.out.println("------------------Menu--------------------");
        System.out.println("1. Nhap danh sach");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Them moi hoa don");
        System.out.println("4. Xoa du lieu");
        System.out.println("5. Sua doi thong tin");
        System.out.println("6. Tim kiem hoa don");
        System.out.println("7. Sap xep hoa don");
        System.out.println("8. Thoat");
        System.out.println("------------------------------------------");
        int chon = Integer.parseInt(scanner.nextLine());
        switch(chon){
            case 1:{ 
                for(int i = 0; i<n ; i++){
                System.out.println("Khach hang thu: "+(i+1));
                HoaDon hd = new HoaDon("HD002", "02/02/2024", "KH002", "Nguyen Van B", "456 DEF Street");
                hd.input();
                danhSachHoaDon.add(hd);
                }
                break;
            }
            case 2:{
                System.out.println("Thong tin khach hang: ");
                for(int i = 0; i<danhSachHoaDon.size();i++){
                    danhSachHoaDon.get(i).output();
                }
            }
                break;
            case 3:{ 
                System.out.println("Thong tin can them moi: ");
                HoaDon hd = new HoaDon();
                hd.input();
                danhSachHoaDon.add(hd);
            }
                break;
            case 4:{
                 int dem=0;
                   System.out.print("Nhập mã khách cần xóa: ");
                   String Ma_Xoa=scanner.nextLine();
                   for(int i=0;i<danhSachHoaDon.size();i++){
                       if(danhSachHoaDon.get(i).getMaKhachHang().equalsIgnoreCase(Ma_Xoa))
                          danhSachHoaDon.remove(i);
                       }
                  }
                 break;
            case 5: 
            {
                   HoaDon hd = new HoaDon();
                   System.out.print("Nhập tên khách cần tìm: ");
                   String ten=scanner.nextLine();
                   int dem=0;
                   for(int i=0;i<danhSachHoaDon.size();i++){
                       if(danhSachHoaDon.get(i).getHotenchuho().equals(ten)){
                           hd.input();
                           danhSachHoaDon.set(i,hd);
                           dem=dem+1;
                       }
                   }
                   if(dem==0){
                       System.out.println("không có khách");            
                   }
               }
            break;
            }
                
        }
}

