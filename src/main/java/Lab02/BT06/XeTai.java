/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
class XeTai extends PhuongTienGiaoThong {
    private double trongTai;

    public XeTai(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, double trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Trọng tải: " + trongTai + " tấn");
    }
}
