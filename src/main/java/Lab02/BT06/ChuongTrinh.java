/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        QLPTGT qlptgt = new QLPTGT();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện theo ID");
            System.out.println("3. Tìm phương tiện theo hãng sản xuất");
            System.out.println("4. Tìm phương tiện theo màu xe");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Để bỏ qua kí tự newline sau khi nhập số

            switch (choice) {
                case 1 -> themPhuongTien(qlptgt, scanner);
                case 2 -> {
                    System.out.print("Nhập ID phương tiện cần xóa: ");
                    String id = scanner.nextLine();
                    qlptgt.xoaPhuongTien(id);
                }
                case 3 -> {
                    System.out.print("Nhập hãng sản xuất cần tìm: ");
                    String hangSanXuat = scanner.nextLine();
                    qlptgt.timPhuongTienTheoHangSanXuat(hangSanXuat);
                }
                case 4 -> {
                    System.out.print("Nhập màu xe cần tìm: ");
                    String mauXe = scanner.nextLine();
                    qlptgt.timPhuongTienTheoMauXe(mauXe);
                }
                case 5 -> System.out.println("Kết thúc chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    public static void themPhuongTien(QLPTGT qlptgt, Scanner scanner) {
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Ô tô");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe tải");
        System.out.print("Chọn: ");
        int loaiPhuongTien = scanner.nextInt();
        scanner.nextLine(); // Để bỏ qua kí tự newline sau khi nhập số

        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        System.out.print("Nhập giá bán: ");
        double giaBan = scanner.nextDouble();
        System.out.print("Nhập màu xe: ");
        scanner.nextLine(); // Để bỏ qua kí tự newline sau khi nhập số
        String mauXe = scanner.nextLine();

        switch (loaiPhuongTien) {
            case 1 -> {
                System.out.print("Nhập số chỗ ngồi: ");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine(); // Để bỏ qua kí tự newline sau khi nhập số
                System.out.print("Nhập kiểu động cơ: ");
                String kieuDongCo = scanner.nextLine();
                qlptgt.themPhuongTien(new Oto(id, hangSanXuat, namSanXuat, giaBan, mauXe, soChoNgoi, kieuDongCo));
            }
            case 2 -> {
                System.out.print("Nhập công suất: ");
                double congSuat = scanner.nextDouble();
                qlptgt.themPhuongTien(new XeMay(id, hangSanXuat, namSanXuat, giaBan, mauXe, congSuat));
            }
            case 3 -> {
                System.out.print("Nhập trọng tải: ");
                double trongTai = scanner.nextDouble();
                qlptgt.themPhuongTien(new XeTai(id, hangSanXuat, namSanXuat, giaBan, mauXe, trongTai));
            }
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
