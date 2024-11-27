package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3);

            switch (shapeType) {
                case 0:
                    shapes.add(new Sphere(1 + Math.random() * 9));
                    break;
                case 1:
                    shapes.add(new Cylinder(1 + Math.random() * 9,5+Math.random()*15));
                    break;
                case 2:
                    shapes.add(new Cube(1 + Math.random() * 9));
                    break;
            }
        }


        for (Shape3DInterface shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}

