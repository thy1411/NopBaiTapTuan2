/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT01;

/**
 *
 * @author ThyThy
 */

import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double rong = scanner.nextDouble();

        // Nhập cạnh của hình vuông
        System.out.print("Nhap canh hinh vuong: ");
        double canh = scanner.nextDouble();

        // Tạo đối tượng ChuNhat và Vuong
        ChuNhat cn = new ChuNhat(dai, rong);
        ChuNhat vu = new Vuong(canh);

        // Gọi phương thức xuat để xem thông tin
        cn.xuat();
        vu.xuat();
    }
}