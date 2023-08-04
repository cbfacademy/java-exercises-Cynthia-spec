package com.cbfacademy.shapes;

public class Paint {
    private double coverage;

public Paint(double coverage) {
    this.coverage = coverage;
       
}

public double amount(Shape shape){
    double numberOfGallons = shape.area()/this.coverage;
    return numberOfGallons;

}

    
}
