package com.cbfacademy.shapes;

public class Sphere extends Shape {
    //this statement - protected final double 𝛑 = 3.142; is same as Math.PI
    protected double radius;

    public Sphere(double radius){
        this.radius = radius;
        shapeName = "Sphere";
    }

    @Override
    public double area(){
        return (4 * (Math.PI * (Math.pow(radius, 2))));
    }
    
}
