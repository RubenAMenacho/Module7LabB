/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author ramlifting
 */
public class ShapeTest {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[6];
      shapes[0] = new Circle(5);
      shapes[1] = new Square(10);
      shapes[2] = new Triangle(6, 8);
      shapes[3] = new Sphere(3);
      shapes[4] = new Cube(4);
      shapes[5] = new Tetrahedron(6);

  for (Shape shape : shapes) {
     System.out.println(shape.toString());

     if (shape instanceof TwoDimensionalShape) {
        System.out.printf("Area: %.2f%n", ((TwoDimensionalShape) shape).getArea());
     } else if (shape instanceof ThreeDimensionalShape) {
        System.out.printf("Surface Area: %.2f%nVolume: %.2f%n", ((ThreeDimensionalShape) shape).getArea(), ((ThreeDimensionalShape) shape).getVolume());
     }

     System.out.println();
  }
   }
}
