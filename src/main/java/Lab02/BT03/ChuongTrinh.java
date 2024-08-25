/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author ThyThy
 */

public class ChuongTrinh {
    private ArrayList<SinhVien> danhSachSinhVien;

    public ChuongTrinh() {
        danhSachSinhVien = new ArrayList<>();
    }

    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            System.out.print("Nhap họ ten ");
            scanner.nextLine(); // Để bỏ qua kí tự newline sau khi nhập số
            String hoTen = scanner.nextLine();
            System.out.print("Nhap ngành (1 - IT, 2 - Biz): ");
            int chonNganh = scanner.nextInt();

            if (chonNganh == 1) {
                System.out.print("Nhap diem Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Nhap diem HTML: ");
                double diemHtml = scanner.nextDouble();
                System.out.print("Nhap diem CSS: ");
                double diemCss = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienIT(hoTen, diemJava, diemHtml, diemCss));
            } else if (chonNganh == 2) {
                System.out.print("Nhap diem Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Nhap diem Sales: ");
                double diemSales = scanner.nextDouble();
                danhSachSinhVien.add(new SinhVienBiz(hoTen, diemMarketing, diemSales));
            }
        }
    }

    public void xuatDanhSach() {
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println("------------------------------------------");
        }
    }

    public void xuatSinhVienGioi() {
        System.out.println("Danh sách sinh vien co hoc lực gioi:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Gioi")) {
                sv.xuat();
                System.out.println("------------------------------------------");
            }
        }
    }

    public void sapXepDanhSach() {
        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sắp xếp danh sách sinh vien theo điểm");
            System.out.println("5. Ket thuc");
            System.out.print("Chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    xuatSinhVienGioi();
                    break;
                case 4:
                    sapXepDanhSach();
                    System.out.println("Danh sach sinh vien sau khi sắp xep:");
                    xuatDanhSach();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        ChuongTrinh qlsv = new ChuongTrinh();
        qlsv.menu();
    }
}

