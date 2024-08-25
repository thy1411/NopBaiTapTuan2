/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02.BT06;

/**
 *
 * @author ThyThy
 */
import java.util.ArrayList;
import java.util.Iterator;

class QLPTGT {
    private ArrayList<PhuongTienGiaoThong> danhSachPhuongTien;

    public QLPTGT() {
        this.danhSachPhuongTien = new ArrayList<>();
    }

    public void themPhuongTien(PhuongTienGiaoThong ptgt) {
        danhSachPhuongTien.add(ptgt);
    }

    public void xoaPhuongTien(String id) {
        Iterator<PhuongTienGiaoThong> iterator = danhSachPhuongTien.iterator();
        while (iterator.hasNext()) {
            PhuongTienGiaoThong ptgt = iterator.next();
            if (ptgt.getId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xóa phương tiện có ID: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy phương tiện với ID: " + id);
    }

    public void timPhuongTienTheoHangSanXuat(String hangSanXuat) {
        boolean timThay = false;
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            if (ptgt.getHangSanXuat().equalsIgnoreCase(hangSanXuat)) {
                ptgt.xuatThongTin();
                System.out.println("----------------------------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy phương tiện nào của hãng: " + hangSanXuat);
        }
    }

    public void timPhuongTienTheoMauXe(String mauXe) {
        boolean timThay = false;
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            if (ptgt.getMauXe().equalsIgnoreCase(mauXe)) {
                ptgt.xuatThongTin();
                System.out.println("--------------------");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy phương tiện nào có màu: " + mauXe);
        }
    }
}
