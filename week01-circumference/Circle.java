package Circumference;

public class Circle {

    // Private fields
    private final double PI = 3.14159;
    private double radius; 

    // No param and parameterized constructors
    public Circle() {
        radius = 0.0;
    }
    public Circle(double rad) {
        radius = rad;
    }

    // Getters and Setter for Radius
    public void setRadius (double rad) {
        radius = rad;
    }
    public double getRadius() {
        return radius;
    }

    //  Circumference Formula
    public double getC() {
        return PI * radius * 2;
    }
}

