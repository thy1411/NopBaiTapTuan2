/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT01;

/**
 *
 * @author ThyThy
 */


public class ChuNhat {
    protected double dai;
    protected double rong;

    // Constructor cho ChuNhat
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // Phương thức tính diện tích
    public double dienTich() {
        return dai * rong;
    }

    // Phương thức tính chu vi
    public double chuVi() {
        return 2 * (dai + rong);
    }

    // Phương thức xuất thông tin
    public void xuat() {
        System.out.println("Hinh chu nhat co chieu dai: " + dai + " - chieu rong: " + rong +
                ", dien tich: " + dienTich() + ", chu vi: " + chuVi());
    }
}
