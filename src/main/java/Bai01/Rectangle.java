/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;

/**
 *
 * @author ThyThy
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.;
        width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double FindArea() {
        double area = length*width;
        return area;
    }
  public double findPerimeter() {
      double result = (length + width)*2;
      return result;
  }
}