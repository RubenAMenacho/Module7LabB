/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shape;

/**
 *
 * @author ramlifting
 */
public abstract class Shape {
   public abstract double getArea();
}

class TwoDimensionalShape extends Shape {
   @Override
   public double getArea() {
      return 0.0;
   }
}

class ThreeDimensionalShape extends Shape {
   public double getArea() {
      return 0.0;
   }
   public double getVolume() {
      return 0.0;
   }
}

class Circle extends TwoDimensionalShape {
   private double radius;
   public Circle(double radius) {
      this.radius = radius;
   }
   @Override
   public double getArea() {
      return Math.PI * radius * radius;
   }
   @Override
   public String toString() {
      return String.format("Circle with radius %.2f", radius);
   }
}

class Square extends TwoDimensionalShape {
   private double side;
   public Square(double side) {
      this.side = side;
   }
   @Override
   public double getArea() {
      return side * side;
   }
   @Override
   public String toString() {
      return String.format("Square with side %.2f", side);
   }
}

class Triangle extends TwoDimensionalShape {
   private double base;
   private double height;
   public Triangle(double base, double height) {
      this.base = base;
      this.height = height;
   }
   @Override
   public double getArea() {
      return 0.5 * base * height;
   }
   @Override
   public String toString() {
      return String.format("Triangle with base %.2f and height %.2f", base, height);
   }
}

class Sphere extends ThreeDimensionalShape {
   private double radius;
   public Sphere(double radius) {
      this.radius = radius;
   }
   @Override
   public double getArea() {
      return 4 * Math.PI * radius * radius;
   }
   @Override
   public double getVolume() {
      return 4.0 / 3.0 * Math.PI * radius * radius * radius;
   }
   @Override
   public String toString() {
      return String.format("Sphere with radius %.2f", radius);
   }
}

class Cube extends ThreeDimensionalShape {
   private double side;
   public Cube(double side) {
      this.side = side;
   }
   @Override
   public double getArea() {
      return 6 * side * side;
   }
   @Override
   public double getVolume() {
      return side * side * side;
   }
   @Override
   public String toString() {
      return String.format("Cube with side %.2f", side);
   }
}

class Tetrahedron extends ThreeDimensionalShape {
   private double side;
   public Tetrahedron(double side) {
      this.side = side;
   }
   @Override
   public double getArea() {
      return Math.sqrt(3) * side * side;
   }
   @Override
   public double getVolume() {
      return Math.sqrt(2) / 12 * side * side * side;
   }
   @Override
   public String toString() {
      return String.format("Tetrahedron with side %.2f", side);
   }
}

