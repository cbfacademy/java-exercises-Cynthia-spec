package com.cbfacademy.shapes;

abstract class Shape {
    protected String shapeName;


    public abstract double area();

    public String toString(){
        return shapeName;
    }
    
}
