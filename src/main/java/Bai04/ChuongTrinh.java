/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class ChuongTrinh {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinhTron = sc.nextDouble();
         HinhTron hinhTron = new HinhTron(banKinhTron);

       
        System.out.println("\nThong tin hinh tron:");
        System.out.println("Ban kinh: " + hinhTron.getBanKinh());
        System.out.println("Dien tich: " + hinhTron.tinhDienTich());
        System.out.println("Chu vi: " + hinhTron.tinhChuVi());

       
        System.out.print("\nNhap ban kinh hinh tru: ");
        double banKinhTru = sc.nextDouble();
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieuCaoTru = sc.nextDouble();
        HinhTru hinhTru = new HinhTru (banKinhTru, chieuCaoTru);

        
        System.out.println("\nThong tin hinh tru:");
        System.out.println("Ban kinh: " + hinhTru.getBanKinh());
        System.out.println("Chieu cao: " + hinhTru.getChieuCao());
        System.out.println("Dien tích: " + hinhTru.tinhDienTich());
        System.out.println("The tich: " + hinhTru.tinhTheTich());
    }
}