/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
class XeMay extends PhuongTienGiaoThong {
    private double congSuat;

    public XeMay(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe, double congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congSuat = congSuat;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Công suất: " + congSuat + " kW");
    }
}

