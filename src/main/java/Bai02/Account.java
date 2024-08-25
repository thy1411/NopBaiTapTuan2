/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai02;

/**
 *
 * @author ThyThy
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

  public void credit(int amount) {
      balance +=amount;
  }
  public void debit(int amount) 
  {
      if(balance>=amount)
      {
          balance -=amount;
      }else
      {
          System.out.println("giao dich rut tien that bai");
      }
  }
public void transferTo(Account other, int amout){
    if (balance>=amout) {
        balance-=amout;
        other.balance+=amout;
        System.out.println("chuyen thanh cong");
    }else
        System.out.println("chuyen that bai");
}
}