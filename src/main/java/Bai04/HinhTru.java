/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai04;

/**
 *
 * @author ThyThy
 */
public class HinhTru extends HinhTron  {
      private double chieuCao;

    // Phương thức khởi tạo không có tham số
    public HinhTru() {
        super();
        this.chieuCao = 0;
    }

    // Phương thức khởi tạo có tham số
    public HinhTru(double banKinh, double chieuCao) {
        super( banKinh);
        this.chieuCao = chieuCao;
    }

    // Phương thức cập nhật chiều cao
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    // Phương thức cung cấp thông tin chiều cao
    public double getChieuCao() {
        return chieuCao;
    }

    // Phương thức tính diện tích của hình trụ (ghi đè)
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * getBanKinh() * (getBanKinh() + chieuCao);
    }

    // Phương thức tính thể tích của hình trụ
    public double tinhTheTich() {
        return Math.PI * getBanKinh() * getBanKinh() * chieuCao;
    }
}