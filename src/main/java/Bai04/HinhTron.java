/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

/**
 *
 * @author ThyThy
 */
public class HinhTron {
     private double banKinh;

   
    public HinhTron() {
        this.banKinh = 0;
    }

  
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

  
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

   
    public double getBanKinh() {
        return banKinh;
    }

   
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

   
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    
}