/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */
public class ChuongTrinh {
    public static ArrayList<SanPham> ds = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n--- MENU QUAN LY SAN PHAM ---");
            System.out.println("1. nhap danh sach san pham");
            System.out.println("2. sap xep man hinh theo gia va xuat ra man hinh");
            System.out.println("3. tim va xoa san pham theo ten");
            System.out.println("4. xuat gia trung binh theo gia san pham");
            System.out.println("0. Thoat");
            System.out.print("nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapXep();
                    xuat();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
              xuatgiaTB();
                    break;
                case 0:
                    System.out.println("chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("lua chon khong hop le vui long chon lai");
                    break;
            }
        } while (luaChon != 0);
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        String chon = "";
        do {
            System.out.println("nhap thong tin san pham:");
            System.out.print("Ten: ");
            String ten = sc.nextLine();
            System.out.print("Gia: ");
            double gia = Double.parseDouble(sc.nextLine());

            ds.add(new SanPham(ten, gia));

            System.out.println("tiep tuc (Y/N)?");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

    private static void xuat() {
        System.out.println("\nDanh sach san pham:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }

    private static void sapXep() {
        Collections.sort(ds, (SanPham sp1, SanPham sp2) -> Double.compare(sp2.getGia(), sp1.getGia()));
        System.out.println("sap xep san pham theo gia thanh cong.");
    }

    private static void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten san pham can xoa: ");
        String ten = sc.nextLine();

        boolean timThay = false;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getTen().equalsIgnoreCase(ten)) {
                ds.remove(i);
                timThay = true;
                System.out.println("xoa san pham thanh cong.");
                break;
            }
        }

        if (!timThay) {
            System.out.println("khong tim thay san pham theo ten: " + ten);
        }
    }
     private static void xuatgiaTB() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach san pham trong.");
            return;
        }
        
        double tongGia = 0;
        for (SanPham sp : ds) {
            tongGia += sp.getGia();
        }
        
        double giaTrungBinh = tongGia / ds.size();
        System.out.println("Gia trung binh cua cac san pham la: " + giaTrungBinh);
    }
}