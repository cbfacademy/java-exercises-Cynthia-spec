package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    //this statement - protected final double 𝛑 = 3.142; is same as Math.PI
    protected double height;
    protected double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double area(){
        return (height *  (Math.PI * (Math.pow(radius, 2))));
    }
    
}
