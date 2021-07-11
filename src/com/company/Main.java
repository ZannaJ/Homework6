package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(10);
	    circle.setRadius(10);

	    // circumference
        System.out.println("Circumference " + circle.getCircumference());

        //Area
        System.out.println("Area " + circle.getArea());
    }
}
