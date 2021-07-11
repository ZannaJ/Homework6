package com.company;

public class Circle {
    private int radius;
    public Circle(){

    }
    public Circle (int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getCircumference(){
        return this.radius * (2 * Math.PI);
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
}
