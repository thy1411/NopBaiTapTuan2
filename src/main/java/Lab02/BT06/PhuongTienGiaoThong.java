/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
abstract class PhuongTienGiaoThong {
    protected String id;
    protected String hangSanXuat;
    protected int namSanXuat;
    protected double giaBan;
    protected String mauXe;

    public PhuongTienGiaoThong(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void xuatThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Màu xe: " + mauXe);
    }
}
