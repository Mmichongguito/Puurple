package ui;

import domain.model.*;

public class Test{

    public static void main (String[] args) {
    /*var  Rect = new Rect();
    Rect.setWidth(65);
    System.out.println("Width: " + Rect.getWidth());
       System.out.println("Height: " + Rect.getWidth());*/
       var s = new Rect();
         s.setWidth(10);
         s.setHeight(20);
         System.out.println("Area: " + s.getArea());
         System.out.println("Perimeter: " + s.getPerimeter());
    }
}