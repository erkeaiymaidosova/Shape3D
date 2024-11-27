package org.example;

public class Sphere implements Shape3DInterface{
    public Sphere(double radius) {
        this.radius = radius;
    }

    private double radius;
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
