package org.example;

public class Cylinder implements  Shape3DInterface{
    private double radius;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    private double height;
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
