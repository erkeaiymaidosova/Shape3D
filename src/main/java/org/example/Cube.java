package org.example;

public class Cube implements Shape3DInterface {
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    private double sideLength;
    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }
}
