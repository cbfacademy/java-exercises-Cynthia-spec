package com.cbfacademy.shapes;

public class PaintShapes {

    public static void main(String[] args){
        // create instance of child classes
         Rectangle rectangle = new Rectangle(35,20);
         Sphere sphere = new Sphere(15);
         Cylinder cylinder = new Cylinder(30, 10);
        
        
        System.out.println(rectangle.area());
        System.out.println(sphere.area());
        System.out.println(cylinder.area());

        

    
    }
    
    
}
