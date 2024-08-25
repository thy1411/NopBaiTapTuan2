/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai02;

import java.text.DecimalFormat;

/**
 *
 * @author ThyThy
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Account ac1, ac2;

        DecimalFormat fmt = new DecimalFormat("#,##0");
        // Tạo đối tượng tài khoản 1: thông tin chính mình
        ac1 = new Account("AC001", "le van teo", 2500000);
        
        // Tạo đối tượng tài khoản 2: thông tin bạn thân
        ac2 = new Account("AC002", "tran minh chi", 1000000);

        System.out.println("--------thong tin tai khoan ban dau--------");
        System.out.println("My Account: id: " + ac1.getId() + " - name: " + ac1.getName() + " - balance: " + fmt.format(ac1.getBalance()));
        System.out.println("My Friend Account: id: " + ac2.getId() + " - name: " + ac2.getName() + " - balance: " + fmt.format(ac2.getBalance()));

        ac1.credit(500000);  // 
        ac2.debit(100000);    

        System.out.println("--------thong tin tai khoan sau khi rut tien,giao dich--------");
        System.out.println("My Account: id: " + ac1.getId() + " - name: " + ac1.getName() + " - balance: " + fmt.format(ac1.getBalance()));
        System.out.println("My Friend Account: id: " + ac2.getId() + " - name: " + ac2.getName() + " - balance: " + fmt.format(ac2.getBalance()));

        ac1.transferTo(ac2, 500000);  // Chuyển 500,000 từ ac1 sang ac2

        System.out.println("--------thong tin tai khoan sau giao dich chuyen khoan--------");
        System.out.println("My Account: id: " + ac1.getId() + " - name: " + ac1.getName() + " - balance: " + fmt.format(ac1.getBalance()));
        System.out.println("My Friend Account: id: " + ac2.getId() + " - name: " + ac2.getName() + " - balance: " + fmt.format(ac2.getBalance()));
    }
    
}