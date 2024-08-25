/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số chỗ ngồi: " + soChoNgoi);
        System.out.println("Kiểu động cơ: " + kieuDongCo);
    }
}
