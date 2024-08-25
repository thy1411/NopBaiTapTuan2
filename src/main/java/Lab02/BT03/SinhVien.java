/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT03;

/**
 *
 * @author ThyThy
 */
abstract class SinhVien {
    protected String hoTen;
    protected String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc luc: " + getHocLuc());
    }
}
