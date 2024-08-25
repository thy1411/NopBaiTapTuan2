/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT01;

/**
 *
 * @author ThyThy
 */


public class Vuong extends ChuNhat {

    // Constructor cho Vuong, gọi lại constructor của ChuNhat
    public Vuong(double canh) {
        super(canh, canh); // Gọi constructor của ChuNhat với dai = rong = canh
    }

    // Ghi đè phương thức xuat để xuất thông tin của hình vuông
    @Override
    public void xuat() {
        System.out.println("Hinh vuong co canh: " + dai +
                ", dien tich: " + dienTich() + ", chu vi: " + chuVi());
    }
}
