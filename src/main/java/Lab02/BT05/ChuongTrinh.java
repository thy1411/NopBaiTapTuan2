/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT05;

import java.util.Scanner;

/**
 *
 * @author ThyThy
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhap so bao danh: ");
                    String soBaoDanh = scanner.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhap đia chi: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Nhap muc uu tien: ");
                    int mucUuTien = scanner.nextInt();
                    scanner.nextLine();  // Đọc bỏ dòng mới

                    System.out.println("Chon khoi thi: A, B, C");
                    String khoiThi = scanner.nextLine().toUpperCase();

                    ThiSinh thiSinh;
                    if (khoiThi.equals("A")) {
                        thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
                    } else if (khoiThi.equals("B")) {
                        thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
                    } else if (khoiThi.equals("C")) {
                        thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
                    } else {
                        System.out.println("Khoi thi khong hop le!");
                        continue;
                    }

                    tuyenSinh.themThiSinh(thiSinh);
                }
                case 2 -> tuyenSinh.hienThiThongTinThiSinh();
                case 3 -> {
                    System.out.print("Nhap so bao danh can tim: ");
                    String sbd = scanner.nextLine();
                    ThiSinh ts = tuyenSinh.timKiemThiSinhTheoSoBaoDanh(sbd);
                    if (ts != null) {
                        ts.hienThiThongTin();
                    } else {
                        System.out.println("Khong tim thay thi sinh voi so bao danh: " + sbd);
                    }
                }
                case 4 -> {
                    System.out.println("Thoat chuong trinh.");
                    return;
                }
                default -> System.out.println("Lua chon khong hop le.");
            }
        }
    }
}

