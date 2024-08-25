/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT05;

/**
 *
 * @author ThyThy
 */
public class ThiSinhKhoiC extends ThiSinh {
   
    private final String monThi = "Văn, Sử, Địa";

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: C");
        System.out.println("Môn thi: " + monThi);
    }
}
