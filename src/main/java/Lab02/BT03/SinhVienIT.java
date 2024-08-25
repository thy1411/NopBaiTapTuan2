/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT03;

/**
 *
 * @author ThyThy
 */
class SinhVienIT extends SinhVien {
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "Cong nghe thong tin");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
