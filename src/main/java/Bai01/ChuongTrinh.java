/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai01;

import java.util.Scanner;


/**
 *
 * @author ThyThy
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Rectangle r1;
     Rectangle r2;
     
     r1 = new Rectangle();
     Scanner sc = new Scanner(System.in);
     System.out.print("cho biet chieu dai");
     double dai = sc.nextDouble();
      System.out.print("cho biet chieu rong");
     double rong = sc.nextDouble();
     r2 = new Rectangle(dai,rong);
     System.out.println("thong tin HCN");
     System.out.println(""+"Dai"+r1.getLength()+"rong"+r1.getWidth()+"dien tich"+r1.FindArea()+"chu vi"+r1.findPerimeter());
   System.out.println("thong tin HCN2");
      System.out.println(""+"Dai"+r2.getLength()+"rong"+r2.getWidth()+"dien tich"+r2.FindArea()+"chu vi"+r2.findPerimeter());
     
     
    }
    
}